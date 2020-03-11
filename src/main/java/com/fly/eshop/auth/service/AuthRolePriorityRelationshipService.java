package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthRolePriorityRelationship;
import java.util.List;

/**
 * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色(AuthRolePriorityRelationship)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public interface AuthRolePriorityRelationshipService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRolePriorityRelationship queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthRolePriorityRelationship> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 实例对象
     */
    AuthRolePriorityRelationship insert(AuthRolePriorityRelationship authRolePriorityRelationship);

    /**
     * 修改数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 实例对象
     */
    AuthRolePriorityRelationship update(AuthRolePriorityRelationship authRolePriorityRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}