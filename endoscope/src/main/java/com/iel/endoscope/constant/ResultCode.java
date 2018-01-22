package com.iel.endoscope.constant;

import java.util.ResourceBundle;

public class ResultCode {

    private static ResourceBundle rb;

    private String code;

    private String message;

    static {
        rb = ResourceBundle.getBundle("messages.error");
    }

    public ResultCode(String code) {
        this.code = code;
        this.message = rb.getString(code);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 未知错误
     */
    public static final ResultCode UNKNOWN = new ResultCode("-1");

    /**
     * 正常操作
     */
    public static final ResultCode SUCCESS = new ResultCode("0");
    
    /**
     * 用户名密码错误
     */
    public static final ResultCode PASSWORD_INCORRECT = new ResultCode("10000");

    /**
     * 登录超时
     */
    public static final ResultCode SESSION_TIME_OUT = new ResultCode("10001");

    /**
     * 未登录
     */
    public static final ResultCode UNLOGIN = new ResultCode("10002");
    
    /**
     * 会员不存在
     */
    public static final ResultCode MEMBER_NOT_EXIST = new ResultCode("10004");
    
    /**
     * 用户被限制登录
     */
    public static final ResultCode MEMBER_LIMIT_LOGIN = new ResultCode("10005");

    /**
     * 请求参数不正确
     */
    public static final ResultCode PARAMETER_ERROR = new ResultCode("10006");
    
    /**
     * 文章没有权限阅读
     */
    public static final ResultCode ARTICLE_NOT_READ = new ResultCode("30000");
    
    /**
     * 访问的资源不存在
     */
    public static final ResultCode ARTICLE_NOT_EXIST = new ResultCode("30001");
    
    /**
     * 专题相关错误
     */
    public static final ResultCode TOPIC_ABOUT = new ResultCode("40000");
    
    /**
     * 访问的专题资源不存在
     */
    public static final ResultCode TOPIC_NOT_EXIST = new ResultCode("40001");

    /**
     * 请求参数不正确
     */
    public static final ResultCode PARAMETER_ERROR = new ResultCode("50001");

    public ResultCode(String code) {
        this.code = code;
        this.message = rb.getString(code);
    }
}
