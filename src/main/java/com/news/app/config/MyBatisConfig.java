package com.news.app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by petardation on 2020/4/15
 * Credit to macro
 */
@Configuration
@MapperScan({"com.news.app.mbg.mapper","com.news.app.dao"})


public class MyBatisConfig {
}