package com.fly.eshop.auth.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 账号与权限的关系表，一个账号可以对应多个权限，一个权限也可以属于多个账号(AuthAccountPriorityRelationship)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public class AuthAccountPriorityRelationship implements Serializable {
    private static final long serialVersionUID = 211926590618019618L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 账号的主键
    */
    private Long accountId;
    /**
    * 权限的主键
    */
    private Long priorityId;
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

    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
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