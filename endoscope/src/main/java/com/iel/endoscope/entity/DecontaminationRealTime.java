package com.iel.endoscope.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wwg on 2017/12/28.
 */
public class DecontaminationRealTime implements Serializable {

    //内镜编号
    private String endoscopeNumber;
    //内镜类型
    private String endoscopeType;
    //单步洗消记录的集合
    private List<Step> steps;
    //洗消人员姓名
    private String employeeName;
    //工作站名称
    private String stationName;

    public String getEndoscopeNumber() {
        return endoscopeNumber;
    }

    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    public String getEndoscopeType() {
        return endoscopeType;
    }

    public void setEndoscopeType(String endoscopeType) {
        this.endoscopeType = endoscopeType;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "DecontaminationRealTime{" +
                "endoscopeNumber='" + endoscopeNumber + '\'' +
                ", endoscopeType='" + endoscopeType + '\'' +
                ", steps=" + steps +
                ", employeeName='" + employeeName + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
