package com.fly.eshop;

import com.fly.eshop.auth.entity.AuthAccount;
import com.fly.eshop.auth.service.AuthAccountService;
import com.fly.eshop.demo.dao.DemoDao;
import com.fly.eshop.demo.entity.Demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class EshopApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {
        Demo demo = demoDao.queryById(1);
        System.out.println(demo);
    }

}
