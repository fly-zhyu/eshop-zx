package com.fly.eshop.auth.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表，在系统中有多个角色，每个角色可以分配一些权限(AuthRole)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-11 18:51:19
 */
public class AuthRole implements Serializable {
    private static final long serialVersionUID = 171637524458071441L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 角色编号
    */
    private String code;
    /**
    * 角色名称
    */
    private String roleName;
    /**
    * 角色的说明备注
    */
    private String roleComment;
    /**
    * 角色是否启用，1：启用，0：未启用
    */
    private Integer isEnabled;
    /**
    * 角色的创建时间
    */
    private Date gmtCreate;
    /**
    * 角色的修改时间
    */
    private Date gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleComment() {
        return roleComment;
    }

    public void setRoleComment(String roleComment) {
        this.roleComment = roleComment;
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

}