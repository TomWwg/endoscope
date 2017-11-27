package com.iel.endoscope.entity;

import java.util.Date;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class UsingLog implements java.io.Serializable {

    // Fields

    // 使用记录ID
    private Long usingLogId;
    // 内镜ID
    private Long endoscopeId;
    // 员工ID
    private Long employeeId;
    // 患者ID
    private Long patientId;
    // 使用时间
    private Date usingTime;
    // 医生
    private String doctor;
    // 创建时间
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public UsingLog() {
    }

    /**
     * full constructor
     */
    public UsingLog(Long endoscopeId, Long employeeId, Long patientId, Date usingTime, String doctor, Date createTime) {
        this.endoscopeId = endoscopeId;
        this.employeeId = employeeId;
        this.patientId = patientId;
        this.usingTime = usingTime;
        this.doctor = doctor;
        this.createTime = createTime;
    }

    // Property accessors

    /**
     * 使用记录ID
     */
    public Long getUsingLogId() {
        return this.usingLogId;
    }

    /**
     * 使用记录ID
     */
    public void setUsingLogId(Long usingLogId) {
        this.usingLogId = usingLogId;
    }

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
     * 员工ID
     */
    public Long getEmployeeId() {
        return this.employeeId;
    }

    /**
     * 员工ID
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 患者ID
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * 患者ID
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * 使用时间
     */
    public Date getUsingTime() {
        return this.usingTime;
    }

    /**
     * 使用时间
     */
    public void setUsingTime(Date usingTime) {
        this.usingTime = usingTime;
    }

    /**
     * 医生
     */
    public String getDoctor() {
        return this.doctor;
    }

    /**
     * 医生
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
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