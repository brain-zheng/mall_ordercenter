package com.mall.account.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zheng haijain
 * @createTime 2020-03-14 19:35
 * @description
 */
@SpringBootApplication
@MapperScan(value = "com.mall.account.dal.dao")
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
