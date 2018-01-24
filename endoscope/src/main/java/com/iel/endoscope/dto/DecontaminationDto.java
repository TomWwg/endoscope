package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Decontamination;
import com.iel.endoscope.entity.Step;

import java.sql.Timestamp;
import java.util.List;

/**
 * 洗消参数转换
 * Created by wwg on 2017/12/5.
 */
public class DecontaminationDto extends PageDto {

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
    private Timestamp createTime;

    /**
     * 最后更新时间
     */
    private Timestamp updateTime;

    /**
     * 洗消耗时
     */
    private String consumeTime;

    /**
     * 审核结果
     */
    private String auditResult;

    /**
     * 为了信息登记页面加入的step的洗消步骤和对应的时间集合
     */
    private List<Step> steps;

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

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
