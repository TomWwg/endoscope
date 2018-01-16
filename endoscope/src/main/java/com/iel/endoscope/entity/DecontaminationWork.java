package com.iel.endoscope.entity;

import java.io.Serializable;

/**
 * 工作量统计页面返回的类
 * @author wwg
 * @date 2018/1/12
 */
public class DecontaminationWork implements Serializable {

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
        return "DecontaminationWork{" +
                "roleId=" + roleId +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", cleaningNumber=" + cleaningNumber +
                ", cleaningPercent='" + cleaningPercent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object){
        DecontaminationWork decontaminationWork = (DecontaminationWork) object;
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        if(employeeNumber == null){
            if(decontaminationWork.getEmployeeNumber() != null){
                return false;
            }
        } else if(!employeeNumber.equals(decontaminationWork.getEmployeeNumber())){
            return false;
        }
        if(employeeName == null){
            if(decontaminationWork.getEmployeeName() != null){
                return false;
            }
        } else if(!employeeName.equals(decontaminationWork.getEmployeeName())){
            return false;
        }
        if(roleName == null){
            if(decontaminationWork.getRoleName() != null){
                return false;
            }
        } else if(!roleName.equals(decontaminationWork.getRoleName())){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
        result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
        return result;
    }
}
