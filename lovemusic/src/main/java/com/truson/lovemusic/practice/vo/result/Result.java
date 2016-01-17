package com.truson.lovemusic.practice.vo.result;

import com.truson.lovemusic.practice.util.result.ResultCodeEnum;

import java.util.HashMap;

/**
 * 定义所有返回值格式
 * Created by lezi on 2015/12/13.
 */
public class Result {

    private String code;
    private String message;
    private ErrorInfo errorInfo;
    private HashMap data;

    public Result(){
        this.code = ResultCodeEnum.error.getCode();
        this.message = ResultCodeEnum.error.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public HashMap getData() {
        return data;
    }

    public void setData(HashMap data) {
        this.data = data;
    }

}
