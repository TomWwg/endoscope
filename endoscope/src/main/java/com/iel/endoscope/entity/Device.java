package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Device implements java.io.Serializable {

    // Fields

    // 设备ID
    private Long deviceId;
    // 所属医院ID
    private Long hospitalId;
    // 工作站ID
    private Long stationId;
    // 设备所在地址
    private String deviceAddress;
    // 设备类型
    private String deviceType;
    // 设备编号
    private String deviceNumber;
    // 设备名称
    private String deviceName;
    //设备状态
    private String status;
    // 备注
    private String remark;
    // 创建时间
    private Timestamp createTime;
    // 最后修改时间
    private Timestamp updateTime;

    // Constructors

    /**
     * default constructor
     */
    public Device() {
    }

    /**
     * full constructor
     */
    public Device(Long hospitalId, Long stationId, String deviceAddress, String deviceType, String deviceNumber, String deviceName, String status, String remark, Timestamp createTime, Timestamp updateTime) {
        this.hospitalId = hospitalId;
        this.stationId = stationId;
        this.deviceAddress = deviceAddress;
        this.deviceType = deviceType;
        this.deviceNumber = deviceNumber;
        this.deviceName = deviceName;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // Property accessors

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}