package com.elite.springbootbootstrap.common;

import com.alibaba.fastjson.JSONObject;
import com.elite.springbootbootstrap.exception.BaseErrorInterface;
import com.elite.springbootbootstrap.exception.CommonResult;
import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * 公共的返回
 */
public class ResultBody {
    private String code;
    private String msg;
    private Object data;

    public ResultBody() {
    }
    public ResultBody(BaseErrorInterface errorInterface) {
        this.code = errorInterface.getResultCode();
        this.msg = errorInterface.getResultMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    /**
     * 成功
     *
     */
    public static ResultBody sucess(Object data){
        ResultBody result = new ResultBody();
        result.setCode(CommonResult.SUCESS.getResultCode());
        result.setMsg(CommonResult.SUCESS.getResultMsg());
        result.setData(data);
        return result;
    }
    /**
     * 失败
     *
     */
    public static ResultBody error(BaseErrorInterface errorInfo){
        ResultBody result = new ResultBody();
        result.setCode(errorInfo.getResultCode());
        result.setMsg(errorInfo.getResultMsg());
        result.setData(null);
        return result;
    }
    /**
     * 失败
     *
     */
    public static ResultBody error(String errorcode, String errMsg){
        ResultBody result = new ResultBody();
        result.setCode(errorcode);
        result.setMsg(errMsg);
        result.setData(null);
        return result;
    }

    /**
     * 失败
     *
     */
    public static ResultBody error(String errMsg){
        ResultBody result = new ResultBody();
        result.setCode("-1");
        result.setMsg(errMsg);
        result.setData(null);
        return result;
    }

    /**
     * 转化为json格式串
     * @return
     */
    @Override
    public String toString() {
      return JSONObject.toJSONString(this);
    }
}
