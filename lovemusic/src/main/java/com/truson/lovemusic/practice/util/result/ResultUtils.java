package com.truson.lovemusic.practice.util.result;

import com.truson.lovemusic.practice.vo.result.ErrorInfo;
import com.truson.lovemusic.practice.vo.result.Result;

/**
 * Created by lezi on 2015/12/13.
 */
public class ResultUtils {

    /**
     * 给result对象添加报错信息
     * @param result
     * @param errorCode
     * @param errorMessage
     */
    public static void setErrorInfo(Result result, String errorCode, String errorMessage){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setErrorCode(errorCode);
        errorInfo.setErrorMessage(errorMessage);
        result.setErrorInfo(errorInfo);
    }
}
