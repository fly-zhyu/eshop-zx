package com.fly.eshop.demo.service;

import com.fly.eshop.demo.entity.Demo;
import java.util.List;

/**
 * (Demo)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-12 10:53:45
 */
public interface DemoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Demo queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Demo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param demo 实例对象
     * @return 实例对象
     */
    Demo insert(Demo demo);

    /**
     * 修改数据
     *
     * @param demo 实例对象
     * @return 实例对象
     */
    Demo update(Demo demo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 性能测试接口
     */
    void performance();
}