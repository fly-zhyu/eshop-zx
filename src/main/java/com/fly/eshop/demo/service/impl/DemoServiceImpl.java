package com.fly.eshop.demo.service.impl;

import com.fly.eshop.auth.dao.AuthAccountDao;
import com.fly.eshop.auth.entity.AuthAccount;
import com.fly.eshop.demo.entity.Demo;
import com.fly.eshop.demo.dao.DemoDao;
import com.fly.eshop.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Demo)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-12 10:53:46
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoDao demoDao;
    @Resource
    private AuthAccountDao authAccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Demo queryById(Integer id) {
        return this.demoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Demo> queryAllByLimit(int offset, int limit) {
        return this.demoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param demo 实例对象
     * @return 实例对象
     */
    @Override
    public Demo insert(Demo demo) {
        this.demoDao.insert(demo);
        return demo;
    }

    /**
     * 修改数据
     *
     * @param demo 实例对象
     * @return 实例对象
     */
    @Override
    public Demo update(Demo demo) {
        this.demoDao.update(demo);
        return this.queryById(demo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.demoDao.deleteById(id) > 0;
    }

    @Override
    public void performance() {
        for (int i = 0; i < 800; i ++){
            int id = i + 1;
            AuthAccount account = this.authAccountDao.queryById(Integer.valueOf(id).longValue());
            System.out.println(account);
            Demo demo = demoDao.queryById(1);
            System.out.println(demo);
        }
    }
}