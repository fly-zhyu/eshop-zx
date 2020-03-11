package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthAccount;
import com.fly.eshop.auth.service.AuthAccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限(AuthAccount)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:18
 */
@RestController
@RequestMapping("authAccount")
public class AuthAccountController {
    /**
     * 服务对象
     */
    @Resource
    private AuthAccountService authAccountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthAccount selectOne(Long id) {
        return this.authAccountService.queryById(id);
    }

}