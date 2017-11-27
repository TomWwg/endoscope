package com.iel.endoscope.util;

/**
 * 加密处理类
 * @author Administrator
 *
 */
public class EncryptUtil {

    /**
     * 盐值
     */
    private static final String SALT="bWxkbmphdmE=";

    /**
     * 密码加盐后MD5加密
     * @param password
     * @return 加密后的密码
     */
    public static String getPWd(String password){
        return new MD5Code().getMD5ofStr(password+"({"+SALT+"})");
    }

}
