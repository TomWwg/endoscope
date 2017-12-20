package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Endoscope;

import java.sql.Timestamp;

/**
 * 内镜的传入参数转化
 * Created by wwg on 2017/12/4.
 * @author wwg
 */
public class EndoscopeDto {

    /**
     * 内镜ID
     */
    private Long endoscopeId;

    /**
     * 内镜编号
     */
    private String endoscopeNumber;

    /**
     * 内镜类型
     */
    private String endoscopeType;

    /**
     * 内镜名称
     */
    private String endoscopeName;

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
    private Timestamp createTime;

    public Long getEndoscopeId() {
        return endoscopeId;
    }

    public void setEndoscopeId(Long endoscopeId) {
        this.endoscopeId = endoscopeId;
    }

    public String getEndoscopeNumber() {
        return endoscopeNumber;
    }

    public void setEndoscopeNumber(String endoscopeNumber) {
        this.endoscopeNumber = endoscopeNumber;
    }

    public String getEndoscopeType() {
        return endoscopeType;
    }

    public void setEndoscopeType(String endoscopeType) {
        this.endoscopeType = endoscopeType;
    }

    public String getEndoscopeName() {
        return endoscopeName;
    }

    public void setEndoscopeName(String endoscopeName) {
        this.endoscopeName = endoscopeName;
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

    public static Endoscope form(EndoscopeDto dto){
        Endoscope endoscope = null;
        if(dto != null){
            endoscope = new Endoscope();
            endoscope.setEndoscopeId(dto.getEndoscopeId());
            endoscope.setEndoscopeNumber(dto.getEndoscopeNumber());
            endoscope.setEndoscopeType(dto.getEndoscopeType());
            endoscope.setEndoscopeName(dto.getEndoscopeName());
            endoscope.setRfid(dto.getRfid());
            endoscope.setRemark(dto.getRemark());
            endoscope.setCreateTime(dto.getCreateTime());
        }
        return endoscope;
    }
}
