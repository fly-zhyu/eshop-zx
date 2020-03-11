package com.fly.eshop.auth.dao;

import com.fly.eshop.auth.entity.AuthAccount;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限(AuthAccount)表数据库访问层
 *
 * @author zhaohuayu
 * @since 2020-03-11 19:21:14
 */
@Mapper
public interface AuthAccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthAccount queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthAccount> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authAccount 实例对象
     * @return 对象列表
     */
    List<AuthAccount> queryAll(AuthAccount authAccount);

    /**
     * 新增数据
     *
     * @param authAccount 实例对象
     * @return 影响行数
     */
    int insert(AuthAccount authAccount);

    /**
     * 修改数据
     *
     * @param authAccount 实例对象
     * @return 影响行数
     */
    int update(AuthAccount authAccount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}