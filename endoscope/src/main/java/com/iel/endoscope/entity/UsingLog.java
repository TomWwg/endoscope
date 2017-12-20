package com.iel.endoscope.entity;

import java.sql.Timestamp;

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
    private Timestamp usingTime;
    // 医生
    private String doctor;
    // 创建时间
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public UsingLog() {
    }

    /**
     * full constructor
     */
    public UsingLog(Long endoscopeId, Long employeeId, Long patientId, Timestamp usingTime, String doctor, Timestamp createTime) {
        this.endoscopeId = endoscopeId;
        this.employeeId = employeeId;
        this.patientId = patientId;
        this.usingTime = usingTime;
        this.doctor = doctor;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getUsingLogId() {
        return usingLogId;
    }

    public void setUsingLogId(Long usingLogId) {
        this.usingLogId = usingLogId;
    }

    public Long getEndoscopeId() {
        return endoscopeId;
    }

    public void setEndoscopeId(Long endoscopeId) {
        this.endoscopeId = endoscopeId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Timestamp getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Timestamp usingTime) {
        this.usingTime = usingTime;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}