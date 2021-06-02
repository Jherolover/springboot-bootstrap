package com.elite.springbootbootstrap.exception;

/**
 * 自定义异常类，继承运行时异常类
 */
public class BusinessException  extends RuntimeException{

    private static  final long serialVersionUID = 1L;

    //错误码
    protected String errorCode;

    //错误描述
    protected String errorMsg;

    public BusinessException(){
        super();
    }
    public BusinessException(BaseErrorInterface baseErrorInterface){
        super(baseErrorInterface.getResultCode());
        this.errorCode = baseErrorInterface.getResultCode();
        this.errorMsg = baseErrorInterface.getResultMsg();
    }

    public BusinessException(BaseErrorInterface baseErrorInterface,Throwable cause){
        super(baseErrorInterface.getResultCode(),cause);
        this.errorCode = baseErrorInterface.getResultCode();
        this.errorMsg = baseErrorInterface.getResultMsg();
    }

    public BusinessException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BusinessException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BusinessException( String errorCode, String errorMsg,Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    public Throwable fillInStackTTrace(){
        return this;
    }

}
