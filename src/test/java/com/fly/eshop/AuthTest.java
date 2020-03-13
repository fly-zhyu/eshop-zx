package com.fly.eshop;

import com.fly.eshop.auth.entity.AuthAccount;
import com.fly.eshop.auth.entity.AuthPriority;
import com.fly.eshop.auth.service.AuthAccountService;
import com.fly.eshop.auth.service.AuthPriorityService;
import com.fly.eshop.demo.dao.DemoDao;
import com.fly.eshop.demo.entity.Demo;
import com.mysql.cj.NoSubInterceptorWrapper;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class AuthTest {

    @Autowired
    private AuthAccountService authAccountService;
    @Autowired
    private AuthPriorityService authPriorityService;

    @Test
    public void testInsertAuthPriority() {
        Date now = new Date();
        for (int i = 1; i <= 10; i++) {
            AuthPriority ap = new AuthPriority();
            ap.setCode("B" + i);
            ap.setUrl("/B" + i);
            ap.setParentId(1L);
            ap.setPriorityComment("A级目录为根权限");
            ap.setPriorityType(1);
            ap.setGmtCreate(now);
            ap.setGmtModified(now);
            authPriorityService.insert(ap);
        }
    }



    @Test
    public void testInsertAuthAccount() {
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
    public void testSelectAuthAccount() {
        AuthAccount authAccount = authAccountService.queryById(1L);
        System.out.println(authAccount);
    }



}
