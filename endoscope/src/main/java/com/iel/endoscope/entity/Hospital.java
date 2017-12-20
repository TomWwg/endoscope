package com.iel.endoscope.entity;

import java.sql.Timestamp;

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
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public Hospital() {
    }

    /**
     * full constructor
     */
    public Hospital(String hospitalName, String address, String remark, Timestamp createTime) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}