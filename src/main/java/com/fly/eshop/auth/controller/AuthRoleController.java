package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthRole;
import com.fly.eshop.auth.service.AuthRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色表，在系统中有多个角色，每个角色可以分配一些权限(AuthRole)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@RestController
@RequestMapping("authRole")
public class AuthRoleController {
    /**
     * 服务对象
     */
    @Resource
    private AuthRoleService authRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthRole selectOne(Long id) {
        return this.authRoleService.queryById(id);
    }

}