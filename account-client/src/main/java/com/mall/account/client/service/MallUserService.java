package com.mall.account.client.service;


import com.mall.account.client.dto.MallUserDTO;

public interface MallUserService {

    String register(String loginName, String password);

    MallUserDTO queryUserByLoginNameAndPasswd(String loginName, String password);
}
