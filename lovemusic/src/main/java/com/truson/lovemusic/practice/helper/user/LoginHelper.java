package com.truson.lovemusic.practice.helper.user;

import com.truson.lovemusic.practice.entity.user.User;
import org.apache.commons.lang.StringUtils;

/**
 * 注册登录相关公用方法
 * Created by lezi on 2015/12/13.
 */
public class LoginHelper {

    /**
     * 检查登录信息是否完整
     * lezi用户除外
     * @param user
     * @return
     */
    public static boolean checkLoginInfo(User user) {
        boolean result = false;
        if (user != null) {
            if (StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getPassword())
                    || StringUtils.equals("lezi", user.getUserName()))
                result = true;
        }
        return result;
    }

}
