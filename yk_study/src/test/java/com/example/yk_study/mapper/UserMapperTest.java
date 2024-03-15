package com.example.yk_study.mapper;

import com.example.yk_study.po.userpo;
import com.example.yk_study.service.IUserService;
import org.springframework.util.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService service;
    @Test
    void testSelect()
    {
        System.out.println(("-----------------------------"));
        List<userpo> userpoList = userMapper.selectList(null);
        Assert.isTrue(5 == userpoList.size(),"");
        userpoList.forEach(System.out::println);
    }

    @Test
    void testSaveAndUpdate(){
        System.out.println(("-----------------------------"));
        userpo useradd = new userpo(6L, "Cindy", 22, "test6@baomidou.com");
        boolean b = service.save(useradd);
        System.out.println(b);
    }
}
