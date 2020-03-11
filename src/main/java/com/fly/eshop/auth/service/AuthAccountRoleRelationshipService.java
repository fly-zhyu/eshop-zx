package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthAccountRoleRelationship;
import java.util.List;

/**
 * 账号和角色的关系表，一个账号可以对应多个角色，一个角色也可以对应多个账号(AuthAccountRoleRelationship)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public interface AuthAccountRoleRelationshipService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthAccountRoleRelationship queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthAccountRoleRelationship> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authAccountRoleRelationship 实例对象
     * @return 实例对象
     */
    AuthAccountRoleRelationship insert(AuthAccountRoleRelationship authAccountRoleRelationship);

    /**
     * 修改数据
     *
     * @param authAccountRoleRelationship 实例对象
     * @return 实例对象
     */
    AuthAccountRoleRelationship update(AuthAccountRoleRelationship authAccountRoleRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}