package com.example.yk_study.mapper;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.*;
import com.example.yk_study.po.userpo;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilsTest {
    @Test
    public void UtilsTest(){

        System.out.println(StrUtil.split("IHav/ADream", CharUtil.SLASH));
        /*System.out.println(DesensitizedUtil.mobilePhone("13267025518"));*/
        String str = "test";
        System.out.println(StrUtil.isEmpty(str));
        System.out.println(StrUtil.isNotEmpty(str));
        System.out.println(StrUtil.removeSuffix("a.jpg",".jpg"));
        System.out.println(StrUtil.removePrefix("a.jpg","a"));
        System.out.println(StrUtil.format(str,"我是占位符"));
        Dict dict = Dict.create()
                .set("key1",1)//int
                .set("key2",1000L)//long
                .set("key3", DateTime.now());//Date
        System.out.println(dict.getLong("key2"));
        /*System.out.println();*/
    }
}
