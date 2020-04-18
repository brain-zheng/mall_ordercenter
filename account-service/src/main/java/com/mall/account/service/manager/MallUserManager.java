package com.mall.account.service.manager;

import com.mall.account.client.dto.MallUserDTO;
import com.mall.account.dal.dao.MallUserDAO;
import com.mall.account.dal.dataobject.MallUserDO;
import com.mall.account.service.converter.MallUserConverter;
import com.mall.common.service.enums.ServiceResultEnum;
import com.mall.common.service.util.MD5Util;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MallUserManager {

    @Resource
    private MallUserDAO mallUserDAO;

    public String register(String loginName, String password) {
        if (mallUserDAO.selectByLoginName(loginName) != null) {
            return ServiceResultEnum.SAME_LOGIN_NAME_EXIST.getResult();
        }
        MallUserDO registerUser = new MallUserDO();
        registerUser.setLoginName(loginName);
        registerUser.setNickName(loginName);
        String passwordMD5 = MD5Util.MD5Encode(password, "UTF-8");
        registerUser.setPasswordMd5(passwordMD5);
        if (mallUserDAO.insertSelective(registerUser) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    public MallUserDTO queryUserByLoginNameAndPasswd(String loginName, String password) {
        MallUserDO mallUserDO = mallUserDAO.selectByLoginNameAndPasswd(loginName, password);
        return MallUserConverter.mallUserDO2DTO(mallUserDO);
    }

}
