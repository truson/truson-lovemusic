package com.truson.lovemusic.practice.service.user;

import com.truson.lovemusic.practice.vo.result.Result;
import com.truson.lovemusic.practice.vo.user.UserVo;

/**
 * 登录操作逻辑层接口
 * Created by lezi on 2015/12/13.
 */
public interface LoginService {

    /**
     * 执行登录操作
     * @param userVo
     * @param result
     */
    void doLogin(Result result, UserVo userVo);

}
