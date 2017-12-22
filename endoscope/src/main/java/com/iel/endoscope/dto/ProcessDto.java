package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Process;

import java.sql.Timestamp;

/**
 * Created by wwg on 2017/12/22.
 * @author wwg
 */
public class ProcessDto extends PageDto {

    /**
     * 手工洗消流程ID
     */
    private Long processId;

    /**
     * 工作站ID
     */
    private Long stationId;

    /**
     * 初洗正常洗消时间
     */
    private String initialNormal;

    /**
     * 初洗最长洗消时间
     */
    private String initialLongest;

    /**
     * 酶洗正常洗消时间
     */
    private String enzymeNormal;

    /**
     * 酶洗最长清洗时间
     */
    private String enzymeLongest;

    /**
     * 次洗正常洗消时间
     */
    private String secondNormal;

    /**
     * 次洗最长清洗时间
     */
    private String secondLongest;

    /**
     * 浸泡正常洗消时间
     */
    private String soakNormal;

    /**
     * 浸泡最长清洗时间
     */
    private String soakLongest;

    /**
     * 末洗正常洗消时间
     */
    private String endNormal;

    /**
     * 末洗最长清洗时间
     */
    private String endLongest;

    /**
     * 干燥正常时间
     */
    private String dryNormal;

    /**
     * 干燥最长时间
     */
    private String dryLongest;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 最后更新时间
     */
    private Timestamp updateTime;

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public String getInitialNormal() {
        return initialNormal;
    }

    public void setInitialNormal(String initialNormal) {
        this.initialNormal = initialNormal;
    }

    public String getInitialLongest() {
        return initialLongest;
    }

    public void setInitialLongest(String initialLongest) {
        this.initialLongest = initialLongest;
    }

    public String getEnzymeNormal() {
        return enzymeNormal;
    }

    public void setEnzymeNormal(String enzymeNormal) {
        this.enzymeNormal = enzymeNormal;
    }

    public String getEnzymeLongest() {
        return enzymeLongest;
    }

    public void setEnzymeLongest(String enzymeLongest) {
        this.enzymeLongest = enzymeLongest;
    }

    public String getSecondNormal() {
        return secondNormal;
    }

    public void setSecondNormal(String secondNormal) {
        this.secondNormal = secondNormal;
    }

    public String getSecondLongest() {
        return secondLongest;
    }

    public void setSecondLongest(String secondLongest) {
        this.secondLongest = secondLongest;
    }

    public String getSoakNormal() {
        return soakNormal;
    }

    public void setSoakNormal(String soakNormal) {
        this.soakNormal = soakNormal;
    }

    public String getSoakLongest() {
        return soakLongest;
    }

    public void setSoakLongest(String soakLongest) {
        this.soakLongest = soakLongest;
    }

    public String getEndNormal() {
        return endNormal;
    }

    public void setEndNormal(String endNormal) {
        this.endNormal = endNormal;
    }

    public String getEndLongest() {
        return endLongest;
    }

    public void setEndLongest(String endLongest) {
        this.endLongest = endLongest;
    }

    public String getDryNormal() {
        return dryNormal;
    }

    public void setDryNormal(String dryNormal) {
        this.dryNormal = dryNormal;
    }

    public String getDryLongest() {
        return dryLongest;
    }

    public void setDryLongest(String dryLongest) {
        this.dryLongest = dryLongest;
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

    public static Process form(ProcessDto dto){
        Process process = null;
        if(dto != null){
            process = new Process();
            process.setProcessId(dto.getProcessId());
            process.setStationId(dto.getStationId());
            process.setInitialNormal(dto.getInitialNormal());
            process.setInitialLongest(dto.getInitialLongest());
            process.setEnzymeNormal(dto.getEnzymeNormal());
            process.setEnzymeLongest(dto.getEnzymeLongest());
            process.setSecondNormal(dto.getSecondNormal());
            process.setSecondLongest(dto.getSecondLongest());
            process.setSoakNormal(dto.getSoakNormal());
            process.setSoakLongest(dto.getSoakLongest());
            process.setEndNormal(dto.getEndNormal());
            process.setEndLongest(dto.getEndLongest());
            process.setDryNormal(dto.getDryNormal());
            process.setDryLongest(dto.getDryLongest());
            process.setRemark(dto.getRemark());
            process.setCreateTime(dto.getCreateTime());
            process.setUpdateTime(dto.getCreateTime());
        }
        return process;
    }
}
