package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public Employee() {
    }

    /**
     * full constructor
     */
    public Employee(Long hospitalId, Long stationId, String employeeNumber, String employeeName, Long roleId, String rfid, String remark, Date createTime) {
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

    /**
     * 员工ID
     */
    public Long getEmployeeId() {
        return this.employeeId;
    }

    /**
     * 员工ID
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 所属医院ID
     */
    public Long getHospitalId() {
        return this.hospitalId;
    }

    /**
     * 所属医院ID
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 所属工作站ID
     */
    public Long getStationId() {
        return this.stationId;
    }

    /**
     * 所属工作站ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * 员工编号
     */
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    /**
     * 员工编号
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * 员工姓名
     */
    public String getEmployeeName() {
        return this.employeeName;
    }

    /**
     * 员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 角色ID
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * RFID
     */
    public String getRfid() {
        return this.rfid;
    }

    /**
     * RFID
     */
    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}