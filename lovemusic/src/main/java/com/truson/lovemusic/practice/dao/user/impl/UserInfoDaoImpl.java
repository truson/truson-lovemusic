package com.truson.lovemusic.practice.dao.user.impl;

import com.truson.lovemusic.practice.dao.base.BaseDaoImpl;
import com.truson.lovemusic.practice.entity.user.User;
import com.truson.lovemusic.practice.dao.user.UserInfoDao;
import org.springframework.stereotype.Repository;

/**
 * 用户信息Dao层
 * Created by lezi on 2015/12/13.
 */
@Repository
public class UserInfoDaoImpl extends BaseDaoImpl<User> implements UserInfoDao {

    private final static String NAMESPACE = "com.truson.lovemusic.practice.dao.user.UserInfoDao.";

    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE + statement;
    }

}
