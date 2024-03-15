package com.example.yk_study.controller;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yk_study.Listener.excelListener;
import com.example.yk_study.dto.userDto;
import com.example.yk_study.mapper.UserMapper;
import com.example.yk_study.po.userpo;
import com.example.yk_study.service.IUserService;
import com.example.yk_study.service.PageService;
import com.example.yk_study.service.RedisService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

//now edit this line for crash
@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService service;
    @Autowired
    private RedisService redisService;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    //I'm now trying to add a line in branch:feature1

    @PostMapping("/WriteExcel")
    public void DownExcel(@RequestParam("path")String path ,@RequestBody List<userDto> users){
        /*EasyExcel.write(path, userpo.class).sheet(0).doWrite(users);*/
        path = path/*+"repeatedWrite" + System.currentTimeMillis() */+ ".xlsx";
        //指定路径和class
        try(ExcelWriter excelWriter = EasyExcel.write(path, userpo.class).build()){
            //对sheet0写入
            WriteSheet writeSheet = EasyExcel.writerSheet(0)
                    .build();
            //写入
            excelWriter.write(users,writeSheet);
        }
    }

    @PostMapping("/Addusers")
    public void Addusers(@RequestParam("path")String path ,@RequestBody List<userDto> users){
        /*redisService.saveDataToRedis(users);*/
        path = path+".xlsx";
        excelListener listener = new excelListener(userMapper);
        /*userMapper.insertBatchSomeColumn(BeanUtil.copyToList(users,userpo.class));*/
        EasyExcel.read(path, userpo.class,listener).sheet().doRead();

    }

    @PostMapping("/TestVa")
    public String TestVa(@RequestBody @Validated userpo user)
    {
        redisTemplate.opsForValue().increment("ABCD");
        return "success";
    }

    @GetMapping("/TestPa/{Str1}/{Str2}")
    /*@GetMapping("/TestPa/{Str1}/and/{Str2}")*/
    public String TestPa(@PathVariable("Str1") String str1,@PathVariable("Str2") String str2 ){
        //@PathVariable("Str1")要这种形式
        return str1+"/////"+str2;
    }
    @Autowired
    private PageService pageService;
    @GetMapping("/selectByPage")
    public IPage<userpo> selectByPage(@RequestParam("current") int current,
                                      @RequestParam("size") int size){
        Page<userpo> p = new Page<>(current,size);
        /*QueryWrapper<userpo> userpoQueryWrapper = new QueryWrapper<>();
        QueryWrapper<userpo> select = userpoQueryWrapper.select("id", "name", "age")
                                                        .eq("id",2);*/
        return pageService.page(p);
    }
    @GetMapping("/selectByIds")
    public List<userpo> getDataByIds(@RequestBody List<Long> ids){
        return redisService.getDataFromRedis(ids);
    }
}
