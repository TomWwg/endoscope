package com.iel.endoscope.dto;

import java.sql.Timestamp;
import java.util.Map;

/**
 * 手工洗消日志的DTO
 * @author wwg
 * @date 2018/1/18
 */
public class DecontaminationLogDto extends PageDto {

    private String endoscopeNumber;

    private String endoscopeName;

    private String endoscopeType;

    private String employeeName;

    private String auditResult;

    private Timestamp startTime;

    private Timestamp endTime;

    public String getEndoscopeNumber() {
        return endoscopeNumber;
    }

    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    public String getEndoscopeName() {
        return endoscopeName;
    }

    public void setEndoscopeName(String endoscopeName) {
        this.endoscopeName = endoscopeName;
    }

    public String getEndoscopeType() {
        return endoscopeType;
    }

    public void setEndoscopeType(String endoscopeType) {
        this.endoscopeType = endoscopeType;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "DecontaminationLogDto{" +
                "endoscopeNumber='" + endoscopeNumber + '\'' +
                ", endoscopeName='" + endoscopeName + '\'' +
                ", endoscopeType='" + endoscopeType + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", auditResult='" + auditResult + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static Map<String, Object> form(DecontaminationLogDto dto){
        Map<String, Object> map = null;
        if(dto != null){
            if(dto.getEndoscopeNumber() != null){
                map.put("endoscopeNumber", dto.getEndoscopeNumber());
            }
            if(dto.getEndoscopeName() != null){
                map.put("endoscopeName", dto.getEndoscopeName());
            }
            if(dto.getEndoscopeNumber() != null){
                map.put("endoscopeType", dto.getEndoscopeType());
            }
            if(dto.getEndoscopeNumber() != null){
                map.put("employeeName", dto.getEmployeeName());
            }
            if(dto.getEndoscopeNumber() != null){
                map.put("auditResult", dto.getAuditResult());
            }
        }
        return map;
    }
}
