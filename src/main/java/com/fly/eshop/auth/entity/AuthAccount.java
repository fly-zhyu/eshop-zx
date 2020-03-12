package com.fly.eshop.auth.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 账号表，电商公司里一个员工就对应着一个账号，每个账号给分配多个角色，同时这个账号也可以给分配多个权限(AuthAccount)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:15
 */
public class AuthAccount implements Serializable {
    private static final long serialVersionUID = 871979169288730722L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 用户名，英文
    */
    private String username;
    /**
    * 账号的密码
    */
    private Integer password;
    /**
    * 姓名，中文
    */
    private String employeName;
    /**
    * 账号的说明备注
    */
    private String accountComment;
    /**
    * 账号是否启用，1：启用，0：未启用
    */
    private Integer isEnabled;
    /**
    * 账号的创建时间
    */
    private Date gmtCreate;
    /**
    * 账号的更新时间
    */
    private Date gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getAccountComment() {
        return accountComment;
    }

    public void setAccountComment(String accountComment) {
        this.accountComment = accountComment;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
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

    @Override
    public String toString() {
        return "AuthAccount{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", employeName='" + employeName + '\'' +
                ", accountComment='" + accountComment + '\'' +
                ", isEnabled=" + isEnabled +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}