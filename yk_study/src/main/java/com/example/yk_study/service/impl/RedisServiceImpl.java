package com.example.yk_study.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.example.yk_study.dto.userDto;
import com.example.yk_study.mapper.UserMapper;
import com.example.yk_study.po.userpo;
import com.example.yk_study.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private /*String*/ StringRedisTemplate redisTemplate;
    @Autowired
    private UserServiceImpl userService;
    public void saveDataToRedis(List<userDto> dataList) {
        //将数据保存到 Redis
        for (userDto datas : dataList) {
            redisTemplate.opsForValue().set("id :"+datas.getId().toString(), JSONUtil.toJsonStr(datas));
        }
        //异步将数据保存到数据库
        CompletableFuture.runAsync(() -> saveDataIntoDb(BeanUtil.copyToList(dataList,userpo.class)));
    }

    public List<userpo> getDataFromRedis(List<Long> ids){
        List<userDto> userDtos = new ArrayList<>();
        String f = null;
        for(Long id : ids){
            f=redisTemplate.opsForValue().get("id :"+id.toString());
            if(f!=null)
                userDtos.add(JSONUtil.toBean(f,userDto.class));
        }
        return BeanUtil.copyToList(userDtos,userpo.class);
    }

    private void saveDataIntoDb(List<userpo> dataList) {
        userService.saveOrUpdateBatch(dataList,500);
    }
}
