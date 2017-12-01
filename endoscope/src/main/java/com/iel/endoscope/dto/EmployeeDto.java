package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Employee;

import java.util.Date;

/**
 * 员工接口的传入参数转换
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public class EmployeeDto {

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 所属医院ID
     */
    private Long hospitalId;

    /**
     * 所属工作站ID
     */
    private Long stationId;

    /**
     * 员工编号
     */
    private String employeeNumber;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * RFID
     */
    private String rfid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static Employee form(EmployeeDto dto){
        Employee employee = null;
        if(dto != null){
            employee = new Employee();
            employee.setEmployeeId(dto.getEmployeeId());
            employee.setHospitalId(dto.getHospitalId());
            employee.setStationId(dto.getStationId());
            employee.setEmployeeNumber(dto.getEmployeeNumber());
            employee.setEmployeeName(dto.getEmployeeName());
            employee.setRoleId(dto.getRoleId());
            employee.setRfid(dto.getRfid());
            employee.setRemark(dto.getRemark());
            employee.setCreateTime(dto.getCreateTime());
        }
        return employee;
    }
}
