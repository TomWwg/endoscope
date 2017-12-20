package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Decontamination implements java.io.Serializable {

    // Fields

    // 手工洗消日志ID
    private Long decontaminationId;
    // 所属医院ID
    private Long hospitalId;
    // 工作站ID
    private Long stationId;
    // 员工ID
    private Long employeeId;
    // 内镜ID
    private Long endoscopeId;
    // 创建时间
    private Timestamp createTime;
    // 最后更新时间
    private Timestamp updateTime;
    // 洗消耗时
    private String consumeTime;
    // 审核结果
    private String auditResult;

    // Constructors

    /**
     * default constructor
     */
    public Decontamination() {
    }

    /**
     * full constructor
     */
    public Decontamination(Long hospitalId, Long stationId, Long employeeId, Long endoscopeId, Timestamp createTime, Timestamp updateTime, String consumeTime, String auditResult) {
        this.hospitalId = hospitalId;
        this.stationId = stationId;
        this.employeeId = employeeId;
        this.endoscopeId = endoscopeId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.consumeTime = consumeTime;
        this.auditResult = auditResult;
    }

    // Property accessors


    public Long getDecontaminationId() {
        return decontaminationId;
    }

    public void setDecontaminationId(Long decontaminationId) {
        this.decontaminationId = decontaminationId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEndoscopeId() {
        return endoscopeId;
    }

    public void setEndoscopeId(Long endoscopeId) {
        this.endoscopeId = endoscopeId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }
}