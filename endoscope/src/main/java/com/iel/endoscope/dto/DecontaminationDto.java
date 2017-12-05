package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Decontamination;

import java.util.Date;

/**
 * 洗消参数转换
 * Created by wwg on 2017/12/5.
 */
public class DecontaminationDto {

    /**
     * 手工洗消日志ID
     */
    private Long decontaminationId;

    /**
     * 所属医院ID
     */
    private Long hospitalId;

    /**
     * 工作站ID
     */
    private Long stationId;

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 内镜ID
     */
    private Long endoscopeId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 洗消耗时
     */
    private String consumeTime;

    /**
     * 审核结果
     */
    private String auditResult;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
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

    public static Decontamination form(DecontaminationDto dto){
        Decontamination decontamination = null;
        if(dto != null){
            decontamination = new Decontamination();
            decontamination.setDecontaminationId(dto.getDecontaminationId());
            decontamination.setHospitalId(dto.getHospitalId());
            decontamination.setStationId(dto.getStationId());
            decontamination.setEmployeeId(dto.getEmployeeId());
            decontamination.setEndoscopeId(dto.getEndoscopeId());
            decontamination.setCreateTime(dto.getCreateTime());
            decontamination.setUpdateTime(dto.getUpdateTime());
            decontamination.setConsumeTime(dto.getConsumeTime());
            decontamination.setAuditResult(dto.getAuditResult());
        }
        return decontamination;
    }
}