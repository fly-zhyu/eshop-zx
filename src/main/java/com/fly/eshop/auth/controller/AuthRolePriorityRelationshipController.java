package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthRolePriorityRelationship;
import com.fly.eshop.auth.service.AuthRolePriorityRelationshipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色(AuthRolePriorityRelationship)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@RestController
@RequestMapping("authRolePriorityRelationship")
public class AuthRolePriorityRelationshipController {
    /**
     * 服务对象
     */
    @Resource
    private AuthRolePriorityRelationshipService authRolePriorityRelationshipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthRolePriorityRelationship selectOne(Long id) {
        return this.authRolePriorityRelationshipService.queryById(id);
    }

}