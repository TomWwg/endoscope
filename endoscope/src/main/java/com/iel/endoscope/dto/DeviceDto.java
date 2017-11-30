package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Device;

import java.util.Date;

/**
 * 设备信息的传入参数
 * Created by wwg on 2017/11/30.
 * wwg
 */
public class DeviceDto {

    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 所属医院ID
     */
    private Long hospitalId;

    /**
     * 工作站ID
     */
    private Long stationId;

    /**
     * 设备所在地址
     */
    private String deviceAddress;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备编号
     */
    private String deviceNumber;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public static Device form(DeviceDto dto){
        Device device = null;
        if(dto != null){
            device = new Device();
            device.setDeviceId(dto.getDeviceId());
            device.setHospitalId(dto.getHospitalId());
            device.setStationId(dto.getStationId());
            device.setDeviceAddress(dto.getDeviceAddress());
            device.setDeviceType(dto.getDeviceType());
            device.setDeviceNumber(dto.getDeviceNumber());
            device.setDeviceName(dto.getDeviceName());
            device.setRemark(dto.getRemark());
            device.setCreateTime(dto.getCreateTime());
            device.setUpdateTime(dto.getUpdateTime());
        }
        return device;
    }
}
