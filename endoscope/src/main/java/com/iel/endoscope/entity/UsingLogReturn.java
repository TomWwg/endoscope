package com.iel.endoscope.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by wwg on 2018/1/2.
 */
public class UsingLogReturn implements Serializable {

    //内镜ID
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

    private String lastPatient;

    private Timestamp lastUsingTime;

    public String getLastPatient() {
        return lastPatient;
    }

    public void setLastPatient(String lastPatient) {
        this.lastPatient = lastPatient;
    }

    public Timestamp getLastUsingTime() {
        return lastUsingTime;
    }

    public void setLastUsingTime(Timestamp lastUsingTime) {
        this.lastUsingTime = lastUsingTime;
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
        return "UsingLogReturn{" +
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
                ", lastPatient='" + lastPatient + '\'' +
                ", lastUsingTime=" + lastUsingTime +
                '}';
    }

    @Override
    public boolean equals(Object object){
        UsingLogReturn usingLogReturn = (UsingLogReturn) object;
        return this.getEndoscopeNumber().equals(usingLogReturn.getEndoscopeNumber());
    }

    @Override
    public int hashCode(){
        return this.getEndoscopeNumber().hashCode();
    }
}
