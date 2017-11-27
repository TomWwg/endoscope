package com.iel.endoscope.entity;

import java.io.Serializable;
import java.util.Date;

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
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(Long hospitalId, String username, String password, String phoneNumber, String remark, Date createTime) {
        this.hospitalId = hospitalId;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

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
     * 医院ID
     */
    public Long getHospitalId() {
        return this.hospitalId;
    }

    /**
     * 医院ID
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 电话号码
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * 电话号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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