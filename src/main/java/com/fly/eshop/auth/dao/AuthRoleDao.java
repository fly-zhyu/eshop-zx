package com.fly.eshop.auth.dao;

import com.fly.eshop.auth.entity.AuthRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 角色表，在系统中有多个角色，每个角色可以分配一些权限(AuthRole)表数据库访问层
 *
 * @author zhaohuayu
 * @since 2020-03-11 19:21:14
 */
@Mapper
public interface AuthRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRole queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authRole 实例对象
     * @return 对象列表
     */
    List<AuthRole> queryAll(AuthRole authRole);

    /**
     * 新增数据
     *
     * @param authRole 实例对象
     * @return 影响行数
     */
    int insert(AuthRole authRole);

    /**
     * 修改数据
     *
     * @param authRole 实例对象
     * @return 影响行数
     */
    int update(AuthRole authRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}