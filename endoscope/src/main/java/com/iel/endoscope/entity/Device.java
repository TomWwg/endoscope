package com.iel.endoscope.entity;

import java.util.Date;

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
    // 备注
    private String remark;
    // 创建时间
    private Date createTime;
    // 最后修改时间
    private Date updateTime;

    // Constructors

    /**
     * default constructor
     */
    public Device() {
    }

    /**
     * full constructor
     */
    public Device(Long hospitalId, Long stationId, String deviceAddress, String deviceType, String deviceNumber, String deviceName, String remark, Date createTime, Date updateTime) {
        this.hospitalId = hospitalId;
        this.stationId = stationId;
        this.deviceAddress = deviceAddress;
        this.deviceType = deviceType;
        this.deviceNumber = deviceNumber;
        this.deviceName = deviceName;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // Property accessors

    /**
     * 设备ID
     */
    public Long getDeviceId() {
        return this.deviceId;
    }

    /**
     * 设备ID
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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
     * 设备所在地址
     */
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    /**
     * 设备所在地址
     */
    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    /**
     * 设备类型
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 设备编号
     */
    public String getDeviceNumber() {
        return this.deviceNumber;
    }

    /**
     * 设备编号
     */
    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    /**
     * 设备名称
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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

    /**
     * 最后修改时间
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}