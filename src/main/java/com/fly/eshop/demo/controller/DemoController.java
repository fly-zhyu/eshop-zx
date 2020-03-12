package com.fly.eshop.demo.controller;

import com.fly.eshop.demo.entity.Demo;
import com.fly.eshop.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Demo)表控制层
 *
 * @author zhaohuayu
 * @since 2020-03-12 10:53:46
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    /**
     * 服务对象
     */
    @Resource
    private DemoService demoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Demo selectOne(Integer id) {
        return this.demoService.queryById(id);
    }

    @GetMapping("/performance")
    public void performance(){
        demoService.performance();
    }

}