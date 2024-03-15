package com.example.yk_study.mybatisplus;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.github.yulichang.base.MPJBaseMapper;
import com.github.yulichang.base.MPJBaseService;
import com.github.yulichang.base.MPJBaseServiceImpl;

import java.sql.Types;
import java.util.Collections;

public class AutoGenerator {

    public static void main(String[] args){String oPath = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/user", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("lch") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("src/main/java/com/example/yk_study"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.yk_study") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .entity("po")
                            .pathInfo(Collections.singletonMap(OutputFile.entity,
                                    StrUtil.format( "{}/src/main/java/com/example/yk_study/po", oPath))); // 设置mapperXml生成路径

                })
                .strategyConfig(builder -> {
                    builder.addInclude("userMapperGener") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .execute();}

    /*private static void createBase(){
        String oPath = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/user", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("lch") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("src/main/java/com/example/yk_study"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.yk_study") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .entity("po")
                            .pathInfo(Collections.singletonMap(OutputFile.entity,
                                    StrUtil.format( "{}/src/main/java/com/example/yk_study/po", oPath))); // 设置mapperXml生成路径

                })
                .strategyConfig(builder -> {
                    builder.addInclude("userMapperGener") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .execute();*/

        /*FastAutoGenerator.create("jdbc:mysql://localhost:3306/test1","root","123456")
                .globalConfig(builder -> {
                    builder.author("lch")//设置作者
                            .enableSwagger()//开启swagger模式
                            .outputDir(StrUtil.format("{}/src/main/java", oPath));//设置输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.yk_study")//设置父包名
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .entity("po")
                            .pathInfo(Collections.singletonMap(OutputFile.entity,
                                    StrUtil.format("{}/src/main/java/com/example/yk_study/po",oPath)));
                })
                .strategyConfig(builder -> {
                    builder.mapperBuilder()
                            //覆盖已有文件
                            .superClass(MPJBaseMapper.class)
                            .enableBaseColumnList()
                            .enableBaseResultMap();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();*/
    /*}*/
}
