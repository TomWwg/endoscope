package com.iel.endoscope.entity;

import java.io.Serializable;

/**
 * 工作量统计页面返回的类
 * @author wwg
 * @date 2018/1/12
 */
public class DecontaminationWork implements Serializable {

    //员工编号
    private String employeeNumber;
    //员工姓名
    private String employeeName;
    //角色
    private String roleName;
    //清洗数量
    private int cleaningNumber;
    //清洗百分比
    private String cleaningPercent;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getCleaningNumber() {
        return cleaningNumber;
    }

    public void setCleaningNumber(int cleaningNumber) {
        this.cleaningNumber = cleaningNumber;
    }

    public String getCleaningPercent() {
        return cleaningPercent;
    }

    public void setCleaningPercent(String cleaningPercent) {
        this.cleaningPercent = cleaningPercent;
    }

    @Override
    public String toString() {
        return "DecontaminationWork{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", cleaningNumber=" + cleaningNumber +
                ", cleaningPercent='" + cleaningPercent + '\'' +
                '}';
    }
}
