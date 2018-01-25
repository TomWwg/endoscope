package com.iel.endoscope.dto;

import com.iel.endoscope.entity.LoginLogReturn;

import java.sql.Timestamp;

/**
 * 登录日志的返回类
 * @author wwg
 * @date 2018/1/25
 */
public class LoginLogReturnDto extends PageDto {

    private Long loginLogId;

    private String loginType;

    private Long userId;

    private String userName;

    private Timestamp createTime;

    private Timestamp startTime;

    private Timestamp endTime;

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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "LoginLogReturnDto{" +
                "loginLogId=" + loginLogId +
                ", loginType='" + loginType + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static LoginLogReturn form(LoginLogReturnDto dto){
        LoginLogReturn loginLogReturn = null;
        if(dto != null){
            loginLogReturn = new LoginLogReturn();
            loginLogReturn.setLoginLogId(dto.getLoginLogId());
            loginLogReturn.setLoginType(dto.getLoginType());
            loginLogReturn.setUserId(dto.getUserId());
            loginLogReturn.setUserName(dto.getUserName());
            loginLogReturn.setCreateTime(dto.getCreateTime());
        }
        return loginLogReturn;
    }
}
