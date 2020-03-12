package com.fly.eshop.auth.service.impl;

import com.fly.eshop.auth.dao.AuthAccountDao;
import com.fly.eshop.auth.entity.AuthAccount;
import com.fly.eshop.auth.service.AuthAccountService;
import com.fly.eshop.demo.dao.DemoDao;
import com.fly.eshop.demo.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限(AuthAccount)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:17
 */
@Service("authAccountService")
public class AuthAccountServiceImpl implements AuthAccountService {
    @Resource
    private AuthAccountDao authAccountDao;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthAccount queryById(Long id) {
        return this.authAccountDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthAccount> queryAllByLimit(int offset, int limit) {
        return this.authAccountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authAccount 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccount insert(AuthAccount authAccount) {
        this.authAccountDao.insert(authAccount);
        return authAccount;
    }

    /**
     * 修改数据
     *
     * @param authAccount 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccount update(AuthAccount authAccount) {
        this.authAccountDao.update(authAccount);
        return this.queryById(authAccount.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authAccountDao.deleteById(id) > 0;
    }

}