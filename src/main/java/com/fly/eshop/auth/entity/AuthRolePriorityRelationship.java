package com.fly.eshop.auth.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色和权限的关系表，角色和权限是多对多的关系，一个角色可以对应多个权限，一个权限可以属于多个角色(AuthRolePriorityRelationship)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public class AuthRolePriorityRelationship implements Serializable {
    private static final long serialVersionUID = -54979554766234629L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 权限的主键
    */
    private Long priorityId;
    /**
    * 角色的主键
    */
    private Long roleId;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 更新时间
    */
    private Date gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}