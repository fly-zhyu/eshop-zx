package com.fly.eshop.auth.service;

import com.fly.eshop.auth.entity.AuthPriority;
import java.util.List;

/**
 * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求(AuthPriority)表服务接口
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public interface AuthPriorityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthPriority queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AuthPriority> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authPriority 实例对象
     * @return 实例对象
     */
    AuthPriority insert(AuthPriority authPriority);

    /**
     * 修改数据
     *
     * @param authPriority 实例对象
     * @return 实例对象
     */
    AuthPriority update(AuthPriority authPriority);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}