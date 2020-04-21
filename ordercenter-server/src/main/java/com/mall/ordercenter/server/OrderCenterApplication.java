package com.mall.ordercenter.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zheng haijain
 * @createTime 2020-03-14 19:35
 * @description
 */
@SpringBootApplication
@MapperScan(value = "com.mall.ordercenter.dal.dao")
@ComponentScan(value = "com.mall.ordercenter")
@ImportResource(value = {"classpath:dubbo.xml"})
public class OrderCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderCenterApplication.class, args);
    }

}
