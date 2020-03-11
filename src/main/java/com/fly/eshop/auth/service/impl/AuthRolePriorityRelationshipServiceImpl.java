package com.fly.eshop.auth.service.impl;

import com.fly.eshop.auth.dao.AuthRolePriorityRelationshipDao;
import com.fly.eshop.auth.entity.AuthRolePriorityRelationship;
import com.fly.eshop.auth.service.AuthRolePriorityRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色(AuthRolePriorityRelationship)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@Service("authRolePriorityRelationshipService")
public class AuthRolePriorityRelationshipServiceImpl implements AuthRolePriorityRelationshipService {
    @Resource
    private AuthRolePriorityRelationshipDao authRolePriorityRelationshipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthRolePriorityRelationship queryById(Long id) {
        return this.authRolePriorityRelationshipDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthRolePriorityRelationship> queryAllByLimit(int offset, int limit) {
        return this.authRolePriorityRelationshipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthRolePriorityRelationship insert(AuthRolePriorityRelationship authRolePriorityRelationship) {
        this.authRolePriorityRelationshipDao.insert(authRolePriorityRelationship);
        return authRolePriorityRelationship;
    }

    /**
     * 修改数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 实例对象
     */
    @Override
    public AuthRolePriorityRelationship update(AuthRolePriorityRelationship authRolePriorityRelationship) {
        this.authRolePriorityRelationshipDao.update(authRolePriorityRelationship);
        return this.queryById(authRolePriorityRelationship.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authRolePriorityRelationshipDao.deleteById(id) > 0;
    }
}