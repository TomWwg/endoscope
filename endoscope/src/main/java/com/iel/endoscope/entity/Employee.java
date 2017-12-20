package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Employee implements java.io.Serializable {

    // Fields

    // 员工ID
    private Long employeeId;
    // 所属医院ID
    private Long hospitalId;
    // 所属工作站ID
    private Long stationId;
    // 员工编号
    private String employeeNumber;
    // 员工姓名
    private String employeeName;
    // 角色ID
    private Long roleId;
    // RFID
    private String rfid;
    // 备注
    private String remark;
    // 创建时间
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public Employee() {
    }

    /**
     * full constructor
     */
    public Employee(Long hospitalId, Long stationId, String employeeNumber, String employeeName, Long roleId, String rfid, String remark, Timestamp createTime) {
        this.hospitalId = hospitalId;
        this.stationId = stationId;
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.roleId = roleId;
        this.rfid = rfid;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}