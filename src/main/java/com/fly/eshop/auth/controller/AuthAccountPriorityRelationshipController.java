package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthAccountPriorityRelationship;
import com.fly.eshop.auth.service.AuthAccountPriorityRelationshipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号(AuthAccountPriorityRelationship)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@RestController
@RequestMapping("authAccountPriorityRelationship")
public class AuthAccountPriorityRelationshipController {
    /**
     * 服务对象
     */
    @Resource
    private AuthAccountPriorityRelationshipService authAccountPriorityRelationshipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthAccountPriorityRelationship selectOne(Long id) {
        return this.authAccountPriorityRelationshipService.queryById(id);
    }

}