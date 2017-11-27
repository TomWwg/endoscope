package com.iel.endoscope.dto;

import com.iel.endoscope.entity.User;

import java.util.Date;

/**
 * Created by wwg on 2017/11/13.
 * @author wwg
 */
public class UserDto extends PageDto {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 医院ID
     */
    private Long hospitalId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static User form(UserDto dto){
        User user = null;
        if(dto != null){
            user = new User();
            user.setUserId(dto.getUserId());
            user.setHospitalId(dto.getHospitalId());
            user.setUsername(dto.getUsername());
            user.setPassword(dto.getPassword());
            user.setPhoneNumber(dto.getPhoneNumber());
            user.setRemark(dto.getRemark());
            user.setCreateTime(dto.getCreateTime());
        }
        return user;
    }
}
