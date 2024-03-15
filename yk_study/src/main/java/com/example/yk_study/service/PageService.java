package com.example.yk_study.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yk_study.mapper.UserMapper;
import com.example.yk_study.po.userpo;

public interface PageService extends IService<userpo>{
    /*public IPage<userpo> selectPage(int current, int size);*/
}
