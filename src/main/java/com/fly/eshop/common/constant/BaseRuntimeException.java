package com.fly.eshop.common.constant;

/**
 * 基础异常封装类异常
 *
 * @author zhaohuayu
 * @Date 2020/3/16 10:21
 * @since 1.0
 */
public class BaseRuntimeException extends RuntimeException{

    private Integer code;

    private String msg;

    public BaseRuntimeException(Integer code, String msg){
        super(msg);
        this.code = code;
    }

    public BaseRuntimeException(ShopResultEnum resultEnum){
        super(resultEnum.msg());
        this.code = resultEnum.code();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
