package com.fly.eshop.auth.service.impl;

import com.fly.eshop.auth.dao.AuthAccountPriorityRelationshipDao;
import com.fly.eshop.auth.entity.AuthAccountPriorityRelationship;
import com.fly.eshop.auth.service.AuthAccountPriorityRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号(AuthAccountPriorityRelationship)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@Service("authAccountPriorityRelationshipService")
public class AuthAccountPriorityRelationshipServiceImpl implements AuthAccountPriorityRelationshipService {
    @Resource
    private AuthAccountPriorityRelationshipDao authAccountPriorityRelationshipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthAccountPriorityRelationship queryById(Long id) {
        return this.authAccountPriorityRelationshipDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthAccountPriorityRelationship> queryAllByLimit(int offset, int limit) {
        return this.authAccountPriorityRelationshipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccountPriorityRelationship insert(AuthAccountPriorityRelationship authAccountPriorityRelationship) {
        this.authAccountPriorityRelationshipDao.insert(authAccountPriorityRelationship);
        return authAccountPriorityRelationship;
    }

    /**
     * 修改数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccountPriorityRelationship update(AuthAccountPriorityRelationship authAccountPriorityRelationship) {
        this.authAccountPriorityRelationshipDao.update(authAccountPriorityRelationship);
        return this.queryById(authAccountPriorityRelationship.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authAccountPriorityRelationshipDao.deleteById(id) > 0;
    }
}