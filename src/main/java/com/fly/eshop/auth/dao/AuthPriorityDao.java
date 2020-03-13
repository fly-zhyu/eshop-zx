package com.fly.eshop.auth.dao;

import com.fly.eshop.auth.entity.AuthPriority;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求(AuthPriority)表数据库访问层
 *
 * @author zhaohuayu
 * @since 2020-03-11 19:21:14
 */
@Mapper
public interface AuthPriorityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthPriority queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthPriority> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param authPriority 实例对象
     * @return 对象列表
     */
    List<AuthPriority> queryAll(AuthPriority authPriority);

    /**
     * 新增数据
     *
     * @param authPriority 实例对象
     * @return 影响行数
     */
    int insert(AuthPriority authPriority);

    /**
     * 修改数据
     *
     * @param authPriority 实例对象
     * @return 影响行数
     */
    int update(AuthPriority authPriority);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    List<AuthPriority> listRootPriorities();

    /**
     * 根据父权限查询子权限
     *
     * @param parentId
     * @return
     */
    List<AuthPriority> listChildPriorities(Long parentId);
}