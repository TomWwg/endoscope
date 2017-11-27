package com.iel.endoscope.entity;

import java.util.Date;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class LoginLog implements java.io.Serializable {

    // Fields

    // 登陆日志ID
    private Long loginLogId;
    // 用户ID
    private Long userId;
    // 登录类型
    private String loginType;
    // 创建时间
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public LoginLog() {
    }

    /**
     * full constructor
     */
    public LoginLog(Long userId, String loginType, Date createTime) {
        this.userId = userId;
        this.loginType = loginType;
        this.createTime = createTime;
    }

    // Property accessors

    /**
     * 登陆日志ID
     */
    public Long getLoginLogId() {
        return this.loginLogId;
    }

    /**
     * 登陆日志ID
     */
    public void setLoginLogId(Long loginLogId) {
        this.loginLogId = loginLogId;
    }

    /**
     * 用户ID
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 登录类型
     */
    public String getLoginType() {
        return this.loginType;
    }

    /**
     * 登录类型
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}