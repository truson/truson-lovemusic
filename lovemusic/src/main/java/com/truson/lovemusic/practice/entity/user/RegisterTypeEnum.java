package com.truson.lovemusic.practice.entity.user;

/**
 * 注册类型枚举(怎么感觉没多大必要写这么个东西~完全没啥好处的感觉)
 * Created by lezi on 2016/1/10.
 */
public enum RegisterTypeEnum {

    ACCOUNT_REGISTER(1, ""),
    MOBILE_REGISTER(2, ""),
    EMAIL_REGISTER(3, "");

    private int type;
    private String redirectPath;

    RegisterTypeEnum(int type, String redirectPath){
        this.type = type;
        this.redirectPath = redirectPath;
    }

    public static String getRedirectPath(int type){
        String redirectPath = "";
        for(RegisterTypeEnum thisEnum : RegisterTypeEnum.class.getEnumConstants()){
            if(thisEnum.getType() == type)
                redirectPath = thisEnum.getRedirectPath();
        }
        return redirectPath;
    }

    public int getType() {
        return type;
    }

    public String getRedirectPath() {
        return redirectPath;
    }

}
