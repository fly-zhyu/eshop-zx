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
class EshopApplicationTests {

    @Autowired
    private AuthAccountService authAccountService;
    @Autowired
    private DemoDao demoDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsert() {
        Date now = new Date();
        for (int i = 0; i < 100; i++) {
            AuthAccount account = new AuthAccount();
            account.setUsername("user" + "-" + (i + 1));
            account.setPassword(i + 1);
            account.setEmployeName(account.getUsername());
            account.setIsEnabled(1);
            account.setGmtCreate(now);
            account.setGmtModified(now);
            authAccountService.insert(account);
        }
    }

    @Test
    public void testSelect() {
        AuthAccount authAccount = authAccountService.queryById(1L);
        System.out.println(authAccount);
        Demo demo = demoDao.queryById(1);
        System.out.println(demo);
    }



}
