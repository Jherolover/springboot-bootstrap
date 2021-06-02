package com.elite.springbootbootstrap.exception;

/**
 * 基本错误信息接口类
 */
public interface  BaseErrorInterface {
    //错误码
    String getResultCode();
    //错误信息
    String getResultMsg();
}
