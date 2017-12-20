package com.iel.endoscope.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 * @author wwg
 */
public class User implements Serializable {

    // Fields

    // 用户ID
    private Long userId;
    // 医院ID
    private Long hospitalId;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 电话号码
    private String phoneNumber;
    // 备注
    private String remark;
    // 创建时间
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(Long hospitalId, String username, String password, String phoneNumber, String remark, Timestamp createTime) {
        this.hospitalId = hospitalId;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", hospitalId=" + hospitalId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}