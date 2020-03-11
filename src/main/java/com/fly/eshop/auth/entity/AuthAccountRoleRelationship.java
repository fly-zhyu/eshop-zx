package com.fly.eshop.auth.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 账号和角色的关系表，一个账号可以对应多个角色，一个角色也可以对应多个账号(AuthAccountRoleRelationship)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public class AuthAccountRoleRelationship implements Serializable {
    private static final long serialVersionUID = -45463814152380626L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 账号的主键
    */
    private Long accountId;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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