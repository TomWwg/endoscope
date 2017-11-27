package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public Endoscope() {
    }

    /**
     * full constructor
     */
    public Endoscope(String endoscopeNumber, String endoscopeType, String endoscopeName, String rfid, String remark, Date createTime) {
        this.endoscopeNumber = endoscopeNumber;
        this.endoscopeType = endoscopeType;
        this.endoscopeName = endoscopeName;
        this.rfid = rfid;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    /**
     * 内镜ID
     */
    public Long getEndoscopeId() {
        return this.endoscopeId;
    }

    /**
     * 内镜ID
     */
    public void setEndoscopeId(Long endoscopeId) {
        this.endoscopeId = endoscopeId;
    }

    /**
     * 内镜编号
     */
    public String getEndoscopeNumber() {
        return this.endoscopeNumber;
    }

    /**
     * 内镜编号
     */
    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    /**
     * 内镜类型
     */
    public String getEndoscopeType() {
        return this.endoscopeType;
    }

    /**
     * 内镜类型
     */
    public void setEndoscopeType(String endoscopeType) {
        this.endoscopeType = endoscopeType;
    }

    /**
     * 内镜名称
     */
    public String getEndoscopeName() {
        return this.endoscopeName;
    }

    /**
     * 内镜名称
     */
    public void setEndoscopeName(String endoscopeName) {
        this.endoscopeName = endoscopeName;
    }

    /**
     * RFID
     */
    public String getRfid() {
        return this.rfid;
    }

    /**
     * RFID
     */
    public void setRfid(String rfid) {
        this.rfid = rfid;
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