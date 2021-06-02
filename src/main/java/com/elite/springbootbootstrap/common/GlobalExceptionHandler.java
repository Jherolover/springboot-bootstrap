package com.elite.springbootbootstrap.common;

import com.elite.springbootbootstrap.exception.BusinessException;
import com.elite.springbootbootstrap.exception.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 需要使用注解 ExceptionHandler
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static  final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResultBody BusinnessException(HttpServletRequest request,BusinessException e){
       logger.info("发生业务异常"+e.getMessage());
        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBody NullPointerException(HttpServletRequest request,NullPointerException e){
        logger.info("发生空指针异常"+e.getMessage());
        return ResultBody.error(CommonResult.BODY_NOT_MATCH);
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody Exception(HttpServletRequest request,Exception e){
        logger.info("发生未知异常"+e.getMessage());
        return ResultBody.error(CommonResult.SERVER_ERROR);
    }
}
