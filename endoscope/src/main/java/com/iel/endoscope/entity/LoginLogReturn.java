package com.iel.endoscope.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *  登录日志的返回结果类
 * @author wwg
 * @date 2018/1/25
 */
public class LoginLogReturn implements Serializable {

    private Long loginLogId;

    private String loginType;

    private Long userId;

    private String userName;

    private Timestamp createTime;

    public Long getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Long loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LoginLogReturn{" +
                "loginLogId=" + loginLogId +
                ", loginType='" + loginType + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
