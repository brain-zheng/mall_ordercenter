package com.mall.account.service.service;

import com.mall.account.client.dto.MallUserDTO;
import com.mall.account.client.enums.DubboErrorEnum;
import com.mall.account.client.service.MallUserService;
import com.mall.account.service.manager.MallUserManager;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service("MallUserServiceImpl")
public class MallUserServiceImpl implements MallUserService {

    @Resource
    private MallUserManager mallUserManager;

    @Override
    public String register(String loginName, String password) {
        if (StringUtils.isEmpty(loginName)) {
            return DubboErrorEnum.LOGINNAME_IS_NULL.getResult();
        }
        if (StringUtils.isEmpty(password)) {
            return DubboErrorEnum.PASSWD_IS_NULL.getResult();
        }
        return mallUserManager.register(loginName, password);
    }

    @Override
    public MallUserDTO queryUserByLoginNameAndPasswd(String loginName, String password) {
        if (StringUtils.isEmpty(loginName)) {
            return null;
        }
        if (StringUtils.isEmpty(password)) {
            return null;
        }
        return mallUserManager.queryUserByLoginNameAndPasswd(loginName, password);

    }
}
