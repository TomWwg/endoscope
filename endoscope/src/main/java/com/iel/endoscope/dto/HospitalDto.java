package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Hospital;

import java.sql.Timestamp;

/**
 * Created by wwg on 2017/11/29.
 * @author wwg
 */
public class HospitalDto extends PageDto {

    /**
     * 医院ID
     */
    private Long hospitalId;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public static Hospital form(HospitalDto dto){
        Hospital hospital = null;
        if(dto != null){
            hospital = new Hospital();
            hospital.setHospitalId(dto.getHospitalId());
            hospital.setHospitalName(dto.getHospitalName());
            hospital.setAddress(dto.getAddress());
            hospital.setRemark(dto.getRemark());
        }
        return hospital;
    }
}
