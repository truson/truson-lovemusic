package com.truson.lovemusic.practice.helper.user;

import com.truson.lovemusic.practice.vo.user.UserVo;
import org.apache.commons.lang.StringUtils;

/**
 * 注册登录相关公用方法
 * Created by lezi on 2015/12/13.
 */
public class LoginHelper {

    /**
     * 检查登录信息是否完整
     * lezi用户除外
     * @param userVo
     * @return
     */
    public static boolean checkLoginInfo(UserVo userVo) {
        boolean result = false;
        if (userVo != null) {
            if (StringUtils.isNotBlank(userVo.getUserName()) && StringUtils.isNotBlank(userVo.getPassword())
                    || StringUtils.equals("lezi", userVo.getUserName()))
                result = true;
        }
        return result;
    }

}
