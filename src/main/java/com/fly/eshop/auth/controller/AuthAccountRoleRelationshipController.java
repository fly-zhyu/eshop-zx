package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthAccountRoleRelationship;
import com.fly.eshop.auth.service.AuthAccountRoleRelationshipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 账号和角色的关系表，一个账号可以对应多个角色，一个角色也可以对应多个账号(AuthAccountRoleRelationship)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@RestController
@RequestMapping("authAccountRoleRelationship")
public class AuthAccountRoleRelationshipController {
    /**
     * 服务对象
     */
    @Resource
    private AuthAccountRoleRelationshipService authAccountRoleRelationshipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthAccountRoleRelationship selectOne(Long id) {
        return this.authAccountRoleRelationshipService.queryById(id);
    }

}