package com.fly.eshop.auth.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限表VO
 *
 * @author zhaohuayu
 * @since 2020-03-13 10:05:30
 */
public class AuthPriorityVO implements Serializable {
    private static final long serialVersionUID = -24874474522338895L;
    /**
    * 主键，自增长
    */
    private Long id;
    /**
    * 权限编号
    */
    private String code;
    /**
    * 权限对应的请求URL
    */
    private String url;
    /**
    * 权限的说明备注
    */
    private String priorityComment;
    /**
    * 权限类型，1：菜单，2：其他
    */
    private Integer priorityType;
    /**
    * 父权限的主键
    */
    private Long parentId;
    /**
    * 权限的创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date gmtCreate;
    /**
    * 权限的修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPriorityComment() {
        return priorityComment;
    }

    public void setPriorityComment(String priorityComment) {
        this.priorityComment = priorityComment;
    }

    public Integer getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(Integer priorityType) {
        this.priorityType = priorityType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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