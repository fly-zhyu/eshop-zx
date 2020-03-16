package com.fly.eshop.common.config;

import com.fly.eshop.common.constant.BaseRuntimeException;
import com.fly.eshop.common.constant.ShopResultEnum;
import com.fly.eshop.common.vo.ResultVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 *
 * @author zhaohuayu
 * @Date 2020/3/16 12:12
 * @since 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseRuntimeException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultVO<Object> handleBaseRuntimeException(BaseRuntimeException e){
        return new ResultVO<>(e.getCode(), e.getMessage(), null);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public ResultVO<Object> handleException(Exception e){
        return new ResultVO<>(ShopResultEnum.FAIL.code(), ShopResultEnum.FAIL.msg(), null);
    }
}
