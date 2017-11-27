package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date createTime;
    // 最后更新时间
    private Date updateTime;
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
    public Decontamination(Long hospitalId, Long stationId, Long employeeId, Long endoscopeId, Date createTime, Date updateTime, String consumeTime, String auditResult) {
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

    /**
     * 手工洗消日志ID
     */
    public Long getDecontaminationId() {
        return this.decontaminationId;
    }

    /**
     * 手工洗消日志ID
     */
    public void setDecontaminationId(Long decontaminationId) {
        this.decontaminationId = decontaminationId;
    }

    /**
     * 所属医院ID
     */
    public Long getHospitalId() {
        return this.hospitalId;
    }

    /**
     * 所属医院ID
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 工作站ID
     */
    public Long getStationId() {
        return this.stationId;
    }

    /**
     * 工作站ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
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

    /**
     * 最后更新时间
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 洗消耗时
     */
    public String getConsumeTime() {
        return this.consumeTime;
    }

    /**
     * 洗消耗时
     */
    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    /**
     * 审核结果
     */
    public String getAuditResult() {
        return this.auditResult;
    }

    /**
     * 审核结果
     */
    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

}