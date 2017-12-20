package com.iel.endoscope.entity;

import java.sql.Timestamp;

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
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public LoginLog() {
    }

    /**
     * full constructor
     */
    public LoginLog(Long userId, String loginType, Timestamp createTime) {
        this.userId = userId;
        this.loginType = loginType;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Long loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}