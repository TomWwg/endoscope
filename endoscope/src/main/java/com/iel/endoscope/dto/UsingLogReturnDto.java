package com.iel.endoscope.dto;

import com.iel.endoscope.entity.UsingLogReturn;

import java.sql.Timestamp;

/**
 * Created by wwg on 2018/1/2.
 */
public class UsingLogReturnDto extends PageDto {

    //内镜使用Id
    private Long usingLogId;

    public Long getUsingLogId() {
        return usingLogId;
    }

    public void setUsingLogId(Long usingLogId) {
        this.usingLogId = usingLogId;
    }

    //内镜编号
    private String endoscopeNumber;
    //内镜名称
    private String endoscopeName;
    //内镜类型
    private String endoscopeType;
    //使用次数
    private int usedTimes;
    //使用率
    private String usedRate;
    //开始时间
    private Timestamp startTime;
    //结束时间
    private Timestamp endTime;
    /**
     * add return property
     * 在内镜使用日志页面需要
     * update by wwg
     */
    //内镜Id
    private Long endoscopeId;
    //洗消人员Id（员工Id）
    private Long employeeId;
    //使用时间
    private Timestamp usingTime;
    //洗消人员姓名（员工姓名）
    private String employeeName;
    //患者姓名
    private String patientName;
    //患者就诊号
    private String visitNumber;

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

    public Timestamp getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(Timestamp usingTime) {
        this.usingTime = usingTime;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }

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

    public int getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(int usedTimes) {
        this.usedTimes = usedTimes;
    }

    public String getUsedRate() {
        return usedRate;
    }

    public void setUsedRate(String usedRate) {
        this.usedRate = usedRate;
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
        return "UsingLogReturnDto{" +
                "usingLogId=" + usingLogId +
                ", endoscopeNumber='" + endoscopeNumber + '\'' +
                ", endoscopeName='" + endoscopeName + '\'' +
                ", endoscopeType='" + endoscopeType + '\'' +
                ", usedTimes=" + usedTimes +
                ", usedRate='" + usedRate + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", endoscopeId=" + endoscopeId +
                ", employeeId=" + employeeId +
                ", usingTime=" + usingTime +
                ", employeeName='" + employeeName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", visitNumber='" + visitNumber + '\'' +
                '}';
    }

    public static UsingLogReturn form(UsingLogReturnDto dto){
        UsingLogReturn usingLogReturn = null;
        if (dto != null){
            usingLogReturn = new UsingLogReturn();
            usingLogReturn.setUsingLogId(dto.getUsingLogId());
            usingLogReturn.setEndoscopeNumber(dto.getEndoscopeNumber());
            usingLogReturn.setEndoscopeName(dto.getEndoscopeName());
            usingLogReturn.setEndoscopeType(dto.getEndoscopeType());
            usingLogReturn.setStartTime(dto.getStartTime());
            usingLogReturn.setEndTime(dto.getEndTime());
            usingLogReturn.setEndoscopeId(dto.getEndoscopeId());
            usingLogReturn.setEmployeeId(dto.getEmployeeId());
            usingLogReturn.setUsingTime(dto.getUsingTime());
            usingLogReturn.setEmployeeName(dto.getEmployeeName());
            usingLogReturn.setPatientName(dto.getPatientName());
            usingLogReturn.setVisitNumber(dto.getVisitNumber());
        }
        return usingLogReturn;
    }
}
