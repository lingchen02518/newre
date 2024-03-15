package com.example.yk_study.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yk_study.mapper.UserMapper;
import com.example.yk_study.po.userpo;
import com.example.yk_study.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl extends ServiceImpl<UserMapper, userpo> implements PageService {
    /*@Autowired
    private UserMapper userMapper;
    public IPage<userpo> selectPage(int current,int size){
        Page<userpo> page = new Page<>(current,size);
        //查询条件可以添加，换掉null
        return userMapper.selectPage(page,null);
    }*/
}
