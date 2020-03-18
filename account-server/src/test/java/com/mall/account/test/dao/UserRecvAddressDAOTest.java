package com.mall.account.test.dao;

import com.mall.account.dal.dao.UserRecvAddressDAO;
import com.mall.account.dal.dataobject.UserRecvAddressDO;
import com.mall.account.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author zheng haijain
 * @createTime 2020-03-17 19:43
 * @description
 */
public class UserRecvAddressDAOTest extends BaseTest {

    @Resource
    public UserRecvAddressDAO userRecvAddressDAO;

    @Test
    public void getByIdTest(){
        Long id = 1L;
        UserRecvAddressDO userRecvAddressDO = userRecvAddressDAO.getById(id);
        System.out.println(userRecvAddressDO);
    }

    @Test
    public void createTest(){
        UserRecvAddressDO userRecvAddressDO = new UserRecvAddressDO();
        userRecvAddressDO.setUserId(1L);
        userRecvAddressDO.setName("brain");
        userRecvAddressDO.setPhone("15395834859");
        userRecvAddressDO.setProvince("浙江省");
        userRecvAddressDO.setCity("宁波市");
        userRecvAddressDO.setRegion("江东区");
        userRecvAddressDO.setDetailAddress("联通家园");
        Integer column = userRecvAddressDAO.create(userRecvAddressDO);
        System.out.println("affect column = " + column);
    }

    @Test
    public void updateTest(){
        UserRecvAddressDO userRecvAddressDO = new UserRecvAddressDO();
        userRecvAddressDO.setId(1L);
        userRecvAddressDO.setCity("杭州市");
        Integer column = userRecvAddressDAO.update(userRecvAddressDO);
        System.out.println("affect column = " + column);
    }

}
