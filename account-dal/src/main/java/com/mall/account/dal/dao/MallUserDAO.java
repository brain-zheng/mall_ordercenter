package com.mall.account.dal.dao;


import com.mall.account.dal.dataobject.MallUserDO;
import org.apache.ibatis.annotations.Param;

public interface MallUserDAO {

    MallUserDO selectByLoginName(String loginName);

    int insertSelective(MallUserDO record);

    MallUserDO selectByLoginNameAndPasswd(@Param("loginName") String loginName, @Param("password") String password);

}
