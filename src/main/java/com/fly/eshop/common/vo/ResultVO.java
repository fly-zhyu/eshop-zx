package com.fly.eshop.common.vo;

import com.fly.eshop.common.constant.ShopResultEnum;

/**
 * 前端返回VO封装
 *
 * @author zhaohuayu
 * @Date 2020/3/16 9:47
 * @since 1.0
 */
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;

    public ResultVO(){

    }

    public ResultVO(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO<T> success(T data){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(ShopResultEnum.SUCCESS.code());
        resultVO.setMsg(ShopResultEnum.SUCCESS.msg());
        resultVO.setData(data);
        return resultVO;
    }

    public ResultVO<T> fail(T data){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(ShopResultEnum.FAIL.code());
        resultVO.setMsg(ShopResultEnum.FAIL.msg());
        resultVO.setData(data);
        return resultVO;
    }

    public ResultVO<T> data(ShopResultEnum resultEnum,T data){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(resultEnum.code());
        resultVO.setMsg(resultEnum.msg());
        resultVO.setData(data);
        return resultVO;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
