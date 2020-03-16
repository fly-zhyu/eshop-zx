package com.fly.eshop.common.constant;

/**
 * 电商返回值封装枚举
 *
 * @author zhaohuayu
 * @Date 2020/3/16 9:58
 * @since 1.0
 */
public enum ShopResultEnum {


    SUCCESS(0, "success"),

    FAIL(-1, "fail"),

    NOT_EXIST(1, "not exist"),
    ;

    private Integer code;

    private String msg;

    ShopResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer code(){
        return this.code;
    }

    public String msg(){
        return this.msg;
    }


}
