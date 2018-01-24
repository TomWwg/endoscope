package com.iel.endoscope.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

/**
 * 手工洗消日志页面的返回类型
 * @author wwg
 * @date 2018/1/18
 */
public class DecontaminationLog implements Serializable {

    private Long decontaminationId;

    private String endoscopeName;

    private String endoscopeNumber;

    private Map<String, String> steps;

    private String employeeName;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String consumeTime;

    private String auditResult;

    public Long getDecontaminationId() {
        return decontaminationId;
    }

    public void setDecontaminationId(Long decontaminationId) {
        this.decontaminationId = decontaminationId;
    }

    public String getEndoscopeName() {
        return endoscopeName;
    }

    public void setEndoscopeName(String endoscopeName) {
        this.endoscopeName = endoscopeName;
    }

    public String getEndoscopeNumber() {
        return endoscopeNumber;
    }

    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    public Map<String, String> getSteps() {
        return steps;
    }

    public void setSteps(Map<String, String> steps) {
        this.steps = steps;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    @Override
    public String toString() {
        return "DecontaminationLog{" +
                "decontaminationId=" + decontaminationId +
                ", endoscopeName='" + endoscopeName + '\'' +
                ", endoscopeNumber='" + endoscopeNumber + '\'' +
                ", steps=" + steps +
                ", employeeName='" + employeeName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", consumeTime='" + consumeTime + '\'' +
                ", auditResult='" + auditResult + '\'' +
                '}';
    }
}
