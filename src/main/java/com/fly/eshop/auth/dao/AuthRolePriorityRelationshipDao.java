package com.fly.eshop.auth.dao;

import com.fly.eshop.auth.entity.AuthRolePriorityRelationship;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色(AuthRolePriorityRelationship)表数据库访问层
 *
 * @author zhaohuayu
 * @since 2020-03-11 19:21:14
 */
@Mapper
public interface AuthRolePriorityRelationshipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRolePriorityRelationship queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthRolePriorityRelationship> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 对象列表
     */
    List<AuthRolePriorityRelationship> queryAll(AuthRolePriorityRelationship authRolePriorityRelationship);

    /**
     * 新增数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 影响行数
     */
    int insert(AuthRolePriorityRelationship authRolePriorityRelationship);

    /**
     * 修改数据
     *
     * @param authRolePriorityRelationship 实例对象
     * @return 影响行数
     */
    int update(AuthRolePriorityRelationship authRolePriorityRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}