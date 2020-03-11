package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthAccount;
import java.util.List;

/**
 * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限(AuthAccount)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:17
 */
public interface AuthAccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthAccount queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthAccount> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authAccount 实例对象
     * @return 实例对象
     */
    AuthAccount insert(AuthAccount authAccount);

    /**
     * 修改数据
     *
     * @param authAccount 实例对象
     * @return 实例对象
     */
    AuthAccount update(AuthAccount authAccount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}