package com.fly.eshop.auth.service.impl;

import com.fly.eshop.auth.dao.AuthPriorityDao;
import com.fly.eshop.auth.dto.AuthPriorityDTO;
import com.fly.eshop.auth.entity.AuthPriority;
import com.fly.eshop.auth.service.AuthPriorityService;
import com.fly.eshop.common.util.BeanConvertUtil;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求(AuthPriority)表服务实现类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
@Service("authPriorityService")
public class AuthPriorityServiceImpl implements AuthPriorityService {
    @Resource
    private AuthPriorityDao authPriorityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthPriority queryById(Long id) {
        return this.authPriorityDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<AuthPriority> queryAllByLimit(int offset, int limit) {
        return this.authPriorityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authPriority 实例对象
     * @return 实例对象
     */
    @Override
    public AuthPriority insert(AuthPriority authPriority) {
        this.authPriorityDao.insert(authPriority);
        return authPriority;
    }

    /**
     * 修改数据
     *
     * @param authPriority 实例对象
     * @return 实例对象
     */
    @Override
    public AuthPriority update(AuthPriority authPriority) {
        this.authPriorityDao.update(authPriority);
        return this.queryById(authPriority.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authPriorityDao.deleteById(id) > 0;
    }

    @Override
    public List<AuthPriorityDTO> listRootPriorities() {
        List<AuthPriority> authPriorityList = this.authPriorityDao.listRootPriorities();
        return BeanConvertUtil.convertListToOtherList(authPriorityList, AuthPriorityDTO.class);
    }

    @Override
    public List<AuthPriorityDTO> listChildPriorities(Long parentId) {
        List<AuthPriority> authPriorityList = this.authPriorityDao.listChildPriorities(parentId);
        return BeanConvertUtil.convertListToOtherList(authPriorityList, AuthPriorityDTO.class);
    }

    @Override
    public Boolean savePriority(AuthPriorityDTO authPriorityDTO) {
        AuthPriority authPriority = BeanConvertUtil.convertBeanToOtherBean(authPriorityDTO, AuthPriority.class);
        AuthPriority insert = this.insert(authPriority);
        if(insert != null){
            return true;
        }
        return false;
    }

    //==============================private================================

}