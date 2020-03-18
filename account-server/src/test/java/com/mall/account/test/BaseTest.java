package com.mall.account.test;

import com.mall.account.server.AccountApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 18:54
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AccountApplication.class)
public class BaseTest {

    @Before
    public void beforeTest() {
        System.out.println("======= start test========");
    }

    @After
    public void afterTest(){
        System.out.println("======= end test========");
    }

}
