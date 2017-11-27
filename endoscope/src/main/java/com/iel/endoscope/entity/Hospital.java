package com.iel.endoscope.entity;

import java.util.Date;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Hospital implements java.io.Serializable {

    // Fields

    // 医院ID
    private Long hospitalId;
    // 医院名称
    private String hospitalName;
    // 地址
    private String address;
    // 备注
    private String remark;
    // 创建时间
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public Hospital() {
    }

    /**
     * full constructor
     */
    public Hospital(String hospitalName, String address, String remark, Date createTime) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

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
     * 医院名称
     */
    public String getHospitalName() {
        return this.hospitalName;
    }

    /**
     * 医院名称
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
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

}