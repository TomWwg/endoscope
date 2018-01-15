package com.iel.endoscope.dto;

import com.iel.endoscope.entity.DecontaminationWork;

import java.sql.Timestamp;

/**
 * Created by wwg on 2018/1/15.
 */
public class DecontaminationWorkDto {

    //角色Id
    private Long roleId;
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
    //开始时间
    private Timestamp startTime;
    //结束时间
    private Timestamp endTime;

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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

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
        return "DecontaminationWorkDto{" +
                "roleId=" + roleId +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", cleaningNumber=" + cleaningNumber +
                ", cleaningPercent='" + cleaningPercent + '\'' +
                '}';
    }

    public static DecontaminationWork form(DecontaminationWorkDto dto){
        DecontaminationWork decontaminationWork = null;
        if(dto != null){
            decontaminationWork = new DecontaminationWork();
            decontaminationWork.setEmployeeNumber(dto.getEmployeeNumber());
            decontaminationWork.setEmployeeName(dto.getEmployeeName());
            decontaminationWork.setRoleName(dto.getRoleName());
            decontaminationWork.setRoleId(dto.getRoleId());
            decontaminationWork.setCleaningNumber(dto.getCleaningNumber());
            decontaminationWork.setCleaningPercent(dto.getCleaningPercent());
        }
        return decontaminationWork;
    }
}
