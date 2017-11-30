package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Station;

import java.util.Date;

/**
 * 工作站传入参数所用Dto
 * Created by wwg on 2017/11/30.
 * wwg
 */
public class StationDto {

    /**
     * 工作站ID
     */
    private Long stationId;

    /**
     * 所属医院
     */
    private Long hospitalId;

    /**
     * 工作站名称
     */
    private String stationName;

    /**
     * 该工作站员工数量
     */
    private Integer employeeAmount;

    /**
     * 清洗槽数量
     */
    private Integer tankAmount;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static Station form(StationDto dto){
        Station station = null;
        if(dto != null){
            station = new Station();
            station.setStationId(dto.getStationId());
            station.setHospitalId(dto.getHospitalId());
            station.setStationName(dto.getStationName());
            station.setEmployeeAmount(dto.getEmployeeAmount());
            station.setTankAmount(dto.getTankAmount());
            station.setRfid(dto.getRfid());
            station.setRemark(dto.getRemark());
            station.setCreateTime(dto.getCreateTime());
        }
        return station;
    }
}
