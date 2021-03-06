package com.truson.lovemusic.practice.controller.user.login;

import com.truson.lovemusic.practice.entity.user.User;
import com.truson.lovemusic.practice.helper.user.LoginHelper;
import com.truson.lovemusic.practice.service.user.LoginService;
import com.truson.lovemusic.practice.util.result.LoginErrorEnum;
import com.truson.lovemusic.practice.util.result.ResultUtils;
import com.truson.lovemusic.practice.vo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登录控制层
 * Created by lezi on 2015/12/13.
 */

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String doLogin(User user, HttpServletRequest request, HttpServletResponse response){
        Result result = new Result();
        if(!LoginHelper.checkLoginInfo(user))
            ResultUtils.setErrorInfo(result, LoginErrorEnum.incomplete_login_information.getCode(), LoginErrorEnum.incomplete_login_information.getMessage());
        loginService.doLogin(result, user);


        return "";
    }


}
