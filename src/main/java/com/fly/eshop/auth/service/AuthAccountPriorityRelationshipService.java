package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthAccountPriorityRelationship;
import java.util.List;

/**
 * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号(AuthAccountPriorityRelationship)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public interface AuthAccountPriorityRelationshipService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthAccountPriorityRelationship queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthAccountPriorityRelationship> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 实例对象
     */
    AuthAccountPriorityRelationship insert(AuthAccountPriorityRelationship authAccountPriorityRelationship);

    /**
     * 修改数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 实例对象
     */
    AuthAccountPriorityRelationship update(AuthAccountPriorityRelationship authAccountPriorityRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}