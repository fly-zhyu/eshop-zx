package com.fly.eshop.auth.dao;

import com.fly.eshop.auth.entity.AuthAccountPriorityRelationship;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号(AuthAccountPriorityRelationship)表数据库访问层
 *
 * @author zhaohuayu
 * @since 2020-03-11 19:21:14
 */
@Mapper
public interface AuthAccountPriorityRelationshipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthAccountPriorityRelationship queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthAccountPriorityRelationship> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 对象列表
     */
    List<AuthAccountPriorityRelationship> queryAll(AuthAccountPriorityRelationship authAccountPriorityRelationship);

    /**
     * 新增数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 影响行数
     */
    int insert(AuthAccountPriorityRelationship authAccountPriorityRelationship);

    /**
     * 修改数据
     *
     * @param authAccountPriorityRelationship 实例对象
     * @return 影响行数
     */
    int update(AuthAccountPriorityRelationship authAccountPriorityRelationship);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}