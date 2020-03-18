package com.mall.account.test.dao;

import com.mall.account.dal.dao.AccountDAO;
import com.mall.account.dal.dataobject.AccountDO;
import com.mall.account.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author zheng haijain
 * @createTime 2020-03-17 15:31
 * @description
 */
public class AccountDAOTest extends BaseTest {

    @Resource
    private AccountDAO accountDAO;

    @Test
    public void getByIdTest(){
        Long id = 1L;
        AccountDO accountDO = accountDAO.getById(id);
        System.out.println(accountDO);
    }

    @Test
    public void createTest(){
        AccountDO accountDO = new AccountDO();
        accountDO.setUsername("admin");
        accountDO.setPassword("123");
        accountDO.setEmail("2209829964@qq.com");
        accountDO.setPhone("15395834859");
        Integer column = accountDAO.create(accountDO);
        System.out.println("affect column=" + column);
    }

    @Test
    public void udpateTest(){
        AccountDO accountDO = new AccountDO();
        accountDO.setId(2L);
        accountDO.setPassword("1234");
        Integer column = accountDAO.update(accountDO);
        System.out.println("affect column=" + column);
    }
}
