package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public Station() {
    }

    /**
     * full constructor
     */
    public Station(Long hospitalId, String stationName, Integer employeeAmount, Integer tankAmount, String rfid, String remark, Date createTime) {
        this.hospitalId = hospitalId;
        this.stationName = stationName;
        this.employeeAmount = employeeAmount;
        this.tankAmount = tankAmount;
        this.rfid = rfid;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    /**
     * 工作站ID
     */
    public Long getStationId() {
        return this.stationId;
    }

    /**
     * 工作站ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
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
     * 工作站名称
     */
    public String getStationName() {
        return this.stationName;
    }

    /**
     * 工作站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 该工作站员工数量
     */
    public Integer getEmployeeAmount() {
        return this.employeeAmount;
    }

    /**
     * 该工作站员工数量
     */
    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    /**
     * 清洗槽数量
     */
    public Integer getTankAmount() {
        return this.tankAmount;
    }

    /**
     * 清洗槽数量
     */
    public void setTankAmount(Integer tankAmount) {
        this.tankAmount = tankAmount;
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