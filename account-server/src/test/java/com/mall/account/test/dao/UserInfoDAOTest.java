package com.mall.account.test.dao;

import com.mall.account.dal.dao.UserInfoDAO;
import com.mall.account.dal.dataobject.UserInfoDO;
import com.mall.account.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 18:53
 * @description
 */
public class UserInfoDAOTest extends BaseTest {

    @Resource
    private UserInfoDAO userInfoDAO;

    @Test
    public void getByUserIdTest(){
        Long userId = 1L;
        UserInfoDO userInfoDO = userInfoDAO.getByUserId(userId);
        System.out.println(userInfoDO);
    }

    @Test
    public void createTest(){
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setUserId(1L);
        userInfoDO.setNickName("haihaihai");
        userInfoDO.setHead("http://localhost:8081/123.img");
        userInfoDO.setBirthday(new Date(1998,6,19));
        userInfoDO.setSignature("hello world");
        Integer column = userInfoDAO.create(userInfoDO);
        System.out.println("affect column" + column);
    }

    @Test
    public void updateTest(){
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setId(1L);
        userInfoDO.setSignature("hello world !!!!");
        Integer column = userInfoDAO.update(userInfoDO);
        System.out.println("affect column" + column);
    }

    @Test
    public void getByIdTest(){
        Long id = 1L;
        UserInfoDO userInfoDO = userInfoDAO.getById(id);
        System.out.println(userInfoDO);
    }

}
