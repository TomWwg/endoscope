package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Station implements java.io.Serializable {

    // Fields

    // 工作站ID
    private Long stationId;
    // 所属医院ID
    private Long hospitalId;
    // 工作站名称
    private String stationName;
    // 该工作站员工数量
    private Integer employeeAmount;
    // 清洗槽数量
    private Integer tankAmount;
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
    public Station() {
    }

    /**
     * full constructor
     */
    public Station(Long hospitalId, String stationName, Integer employeeAmount, Integer tankAmount, String rfid, String remark, Timestamp createTime) {
        this.hospitalId = hospitalId;
        this.stationName = stationName;
        this.employeeAmount = employeeAmount;
        this.tankAmount = tankAmount;
        this.rfid = rfid;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    public Integer getTankAmount() {
        return tankAmount;
    }

    public void setTankAmount(Integer tankAmount) {
        this.tankAmount = tankAmount;
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