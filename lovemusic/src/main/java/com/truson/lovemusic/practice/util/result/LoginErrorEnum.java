package com.truson.lovemusic.practice.util.result;

/**
 * 登录错误枚举
 * Created by lezi on 2015/12/13.
 */
public enum LoginErrorEnum {

    incomplete_login_information("000001", "登录信息不完善！");

    private String code;
    private String message;

    //必须有带参构造器，且默认为private
    LoginErrorEnum(String code, String message){
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
