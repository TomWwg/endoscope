package com.iel.endoscope.dto;

import com.iel.endoscope.entity.LoginLog;

import java.util.Date;

/**
 * 登录日志参数转换
 * Created by wwg on 2017/12/6.
 * @author wwg
 */
public class LoginLogDto {

    /**
     * 登陆日志ID
     */
    private Long loginLogId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 登录类型
     */
    private String loginType;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static LoginLog form(LoginLogDto dto){
        LoginLog loginLog = null;
        if(dto != null){
            loginLog = new LoginLog();
            loginLog.setLoginLogId(dto.getLoginLogId());
            loginLog.setUserId(dto.getUserId());
            loginLog.setLoginType(dto.getLoginType());
            loginLog.setCreateTime(dto.getCreateTime());
        }
        return loginLog;
    }
}
