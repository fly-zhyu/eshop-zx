package com.fly.eshop.auth.service.impl;

import com.fly.eshop.auth.dao.AuthAccountRoleRelationshipDao;
import com.fly.eshop.auth.entity.AuthAccountRoleRelationship;
import com.fly.eshop.auth.service.AuthAccountRoleRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账号和角色的关系表，一个账号可以对应多个角色，一个角色也可以对应多个账号(AuthAccountRoleRelationship)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@Service("authAccountRoleRelationshipService")
public class AuthAccountRoleRelationshipServiceImpl implements AuthAccountRoleRelationshipService {
    @Resource
    private AuthAccountRoleRelationshipDao authAccountRoleRelationshipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthAccountRoleRelationship queryById(Long id) {
        return this.authAccountRoleRelationshipDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthAccountRoleRelationship> queryAllByLimit(int offset, int limit) {
        return this.authAccountRoleRelationshipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authAccountRoleRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccountRoleRelationship insert(AuthAccountRoleRelationship authAccountRoleRelationship) {
        this.authAccountRoleRelationshipDao.insert(authAccountRoleRelationship);
        return authAccountRoleRelationship;
    }

    /**
     * 修改数据
     *
     * @param authAccountRoleRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthAccountRoleRelationship update(AuthAccountRoleRelationship authAccountRoleRelationship) {
        this.authAccountRoleRelationshipDao.update(authAccountRoleRelationship);
        return this.queryById(authAccountRoleRelationship.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authAccountRoleRelationshipDao.deleteById(id) > 0;
    }
}