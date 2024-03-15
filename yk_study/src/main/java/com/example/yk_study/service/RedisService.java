package com.example.yk_study.service;

import com.example.yk_study.dto.userDto;
import com.example.yk_study.po.userpo;

import java.util.List;

public interface RedisService {
    public void saveDataToRedis(List<userDto> dataList);
    public List<userpo> getDataFromRedis(List<Long> ids);
}
