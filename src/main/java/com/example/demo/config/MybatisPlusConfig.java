package com.example.demo.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 配置
 * Created by 卢松炯 on 2018/9/2.
 */
@MapperScan("com.example.demo.mapper*")
@Configuration
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    
    //乐观锁配置
    @Bean
    public OptimisticLockerInterceptor optimisticLoker() {
    	return new OptimisticLockerInterceptor();
    }
}
