package com.truson.lovemusic.practice.util.result;

/**
 * 访问服务器执行状况枚举
 * Created by lezi on 2015/12/13.
 */
public enum ResultCode {

    success("1", "success"),
    error("0", "error");

    private String code;
    private String message;

    //必须有带参构造器，且默认为private
    ResultCode(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
