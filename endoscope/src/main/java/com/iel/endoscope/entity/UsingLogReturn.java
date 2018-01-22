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
                "endoscopeNumber='" + endoscopeNumber + '\'' +
                ", endoscopeName='" + endoscopeName + '\'' +
                ", endoscopeType='" + endoscopeType + '\'' +
                ", usedTimes=" + usedTimes +
                ", usedRate='" + usedRate + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
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
