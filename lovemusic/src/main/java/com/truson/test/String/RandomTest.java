package com.truson.test.String;

import org.apache.commons.lang.StringUtils;

import java.util.Random;

/**
 * 一些关于随机字串的方法
 * Created by lezi on 2015/12/29.
 */
public class RandomTest {

    public static final int DEFAULT_STR_LENGTH = 4;
    public static final String LOWER_BASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER_BASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBER_BASE = "0123456789";
    public static final int RANDOM_LOWER = 1;
    public static final int RANDOM_UPPER = 2;
    public static final int RANDOM_MIX = 3;
    public static final int RANDOM_MIX_WITH_NUM = 4;

    public static String generateRandomStr() throws Exception {
        return generateRandomStr(DEFAULT_STR_LENGTH);
    }

    public static String generateRandomStr(int length) throws Exception {
        return generateRandomStr(DEFAULT_STR_LENGTH, RANDOM_LOWER);
    }

    /**
     * 生成随机字符串
     * @param length 字符串长度
     * @param type 生成字符串类型
     * @return
     */
    public static String generateRandomStr(int length, int type) throws Exception {
        String base = getBaseStr(type);
        if(StringUtils.isBlank(base))
            throw new Exception("错误的字符串类型！");
        Random random = new Random();
        StringBuffer resultStr = new StringBuffer();
        for(int i = 0; i < length; i++){
            int randomInt = random.nextInt(base.length());
            resultStr.append(base.charAt(randomInt));
        }
        return resultStr.toString();
    }

    /**
     * 根据传来的type值组织基础字符串
     * @param type
     * @return
     */
    public static String getBaseStr(int type){
        String base = "";
        switch (type){
            case RANDOM_LOWER:
                base = LOWER_BASE;
                break;
            case RANDOM_UPPER:
                base = UPPER_BASE;
                break;
            case RANDOM_MIX:
                base = LOWER_BASE + UPPER_BASE;
                break;
            case RANDOM_MIX_WITH_NUM:
                base = LOWER_BASE + UPPER_BASE + NUMBER_BASE;
                break;
            default:
                break;
        }
        return base;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(generateRandomStr());
        System.out.println(generateRandomStr(6, RandomTest.RANDOM_LOWER));
        System.out.println(generateRandomStr(6, RandomTest.RANDOM_MIX));
        System.out.println(generateRandomStr(6, RandomTest.RANDOM_UPPER));
        System.out.println(generateRandomStr(6, RandomTest.RANDOM_MIX_WITH_NUM));
    }
}
