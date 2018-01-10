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
                "endoscopeNumber='" + endoscopeNumber + '\'' +
                ", endoscopeName='" + endoscopeName + '\'' +
                ", endoscopeType='" + endoscopeType + '\'' +
                ", usedTimes=" + usedTimes +
                ", usedRate='" + usedRate + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static UsingLogReturn form(UsingLogReturnDto dto){
        UsingLogReturn usingLogReturn = null;
        if (dto != null){
            usingLogReturn = new UsingLogReturn();
            usingLogReturn.setEndoscopeNumber(dto.getEndoscopeNumber());
            usingLogReturn.setEndoscopeName(dto.getEndoscopeName());
            usingLogReturn.setEndoscopeType(dto.getEndoscopeType());
            usingLogReturn.setStartTime(dto.getStartTime());
            usingLogReturn.setEndTime(dto.getEndTime());
        }
        return usingLogReturn;
    }
}
