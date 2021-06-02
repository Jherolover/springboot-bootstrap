package com.elite.springbootbootstrap.exception;

/**
 * 返回公共的结果类
 */
public enum CommonResult  implements  BaseErrorInterface {

    //自定义操作类
    SUCESS("200","成功!"),
    BODY_NOT_MATCH("4400","请求的数据格式不符！"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不存在"),
    NOT_FOUND("404","请求的资源不存在"),
    SERVER_ERROR("500","服务器内部出错");

    /**
     * 错误码
     */
    private String resultcode;

    /**
     * 错误描述
     */
    private String resultMsg;

    /**
     * 构造器
     * @param resultcode
     * @param resultMsg
     */
    CommonResult(String resultcode, String resultMsg) {
        this.resultcode = resultcode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultcode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
