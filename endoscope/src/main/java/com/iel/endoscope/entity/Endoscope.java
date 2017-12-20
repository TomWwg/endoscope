package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Endoscope implements java.io.Serializable {

    // Fields

    // 内镜ID
    private Long endoscopeId;
    // 内镜编号
    private String endoscopeNumber;
    // 内镜类型
    private String endoscopeType;
    // 内镜名称
    private String endoscopeName;
    // RFID
    private String rfid;
    // 备注
    private String remark;
    // 创建时间
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public Endoscope() {
    }

    /**
     * full constructor
     */
    public Endoscope(String endoscopeNumber, String endoscopeType, String endoscopeName, String rfid, String remark, Timestamp createTime) {
        this.endoscopeNumber = endoscopeNumber;
        this.endoscopeType = endoscopeType;
        this.endoscopeName = endoscopeName;
        this.rfid = rfid;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getEndoscopeId() {
        return endoscopeId;
    }

    public void setEndoscopeId(Long endoscopeId) {
        this.endoscopeId = endoscopeId;
    }

    public String getEndoscopeNumber() {
        return endoscopeNumber;
    }

    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    public String getEndoscopeType() {
        return endoscopeType;
    }

    public void setEndoscopeType(String endoscopeType) {
        this.endoscopeType = endoscopeType;
    }

    public String getEndoscopeName() {
        return endoscopeName;
    }

    public void setEndoscopeName(String endoscopeName) {
        this.endoscopeName = endoscopeName;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
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