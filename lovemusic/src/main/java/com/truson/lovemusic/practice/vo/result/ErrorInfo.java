package com.truson.lovemusic.practice.vo.result;

/**
 * 统一错误信息格式
 * Created by lezi on 2015/12/13.
 */
public class ErrorInfo {

    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
