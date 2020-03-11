package com.fly.eshop.auth.controller;

import com.fly.eshop.auth.entity.AuthPriority;
import com.fly.eshop.auth.service.AuthPriorityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求(AuthPriority)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@RestController
@RequestMapping("authPriority")
public class AuthPriorityController {
    /**
     * 服务对象
     */
    @Resource
    private AuthPriorityService authPriorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AuthPriority selectOne(Long id) {
        return this.authPriorityService.queryById(id);
    }

}