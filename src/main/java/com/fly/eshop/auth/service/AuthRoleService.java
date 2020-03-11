package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthRole;
import java.util.List;

/**
 * 角色表，在系统中有多个角色，每个角色可以分配一些权限(AuthRole)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public interface AuthRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthRole queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    AuthRole insert(AuthRole authRole);

    /**
     * 修改数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    AuthRole update(AuthRole authRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}