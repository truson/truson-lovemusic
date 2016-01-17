package com.truson.lovemusic.practice.entity.user;

import com.truson.lovemusic.practice.entity.BaseEntity;

/**
 * 用户信息实体
 * Created by lezi on 2015/12/13.
 */
public class User extends BaseEntity {

    private String userName;
    private String password;
    private String mobile;
    private String email;
    private String realInfoId;
    private String nick;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealInfoId() {
        return realInfoId;
    }

    public void setRealInfoId(String realInfoId) {
        this.realInfoId = realInfoId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
