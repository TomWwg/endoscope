package com.iel.endoscope.entity;

import java.util.Date;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Process implements java.io.Serializable {

    // Fields

    // 手工洗消流程ID
    private Long processId;
    // 工作站ID
    private Long stationId;
    // 初洗正常洗消时间
    private String initialNormal;
    // 初洗最长洗消时间
    private String initialLongest;
    // 酶洗正常洗消时间
    private String enzymeNormal;
    // 酶洗最长清洗时间
    private String enzymeLongest;
    // 次洗正常洗消时间
    private String secondNormal;
    // 次洗最长清洗时间
    private String secondLongest;
    // 浸泡正常洗消时间
    private String soakNormal;
    // 浸泡最长清洗时间
    private String soakLongest;
    // 末洗正常洗消时间
    private String endNormal;
    // 末洗最长清洗时间
    private String endLongest;
    // 干燥正常时间
    private String dryNormal;
    // 干燥最长时间
    private String dryLongest;
    // 备注
    private String remark;
    // 创建时间
    private Date createTime;
    // 最后更新时间
    private Date updateTime;

    // Constructors

    /**
     * default constructor
     */
    public Process() {
    }

    /**
     * full constructor
     */
    public Process(Long stationId, String initialNormal, String initialLongest, String enzymeNormal, String enzymeLongest, String secondNormal, String secondLongest, String soakNormal, String soakLongest, String endNormal, String endLongest, String dryNormal, String dryLongest, String remark, Date createTime, Date updateTime) {
        this.stationId = stationId;
        this.initialNormal = initialNormal;
        this.initialLongest = initialLongest;
        this.enzymeNormal = enzymeNormal;
        this.enzymeLongest = enzymeLongest;
        this.secondNormal = secondNormal;
        this.secondLongest = secondLongest;
        this.soakNormal = soakNormal;
        this.soakLongest = soakLongest;
        this.endNormal = endNormal;
        this.endLongest = endLongest;
        this.dryNormal = dryNormal;
        this.dryLongest = dryLongest;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // Property accessors

    /**
     * 手工洗消流程ID
     */
    public Long getProcessId() {
        return this.processId;
    }

    /**
     * 手工洗消流程ID
     */
    public void setProcessId(Long processId) {
        this.processId = processId;
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
     * 初洗正常洗消时间
     */
    public String getInitialNormal() {
        return this.initialNormal;
    }

    /**
     * 初洗正常洗消时间
     */
    public void setInitialNormal(String initialNormal) {
        this.initialNormal = initialNormal;
    }

    /**
     * 初洗最长洗消时间
     */
    public String getInitialLongest() {
        return this.initialLongest;
    }

    /**
     * 初洗最长洗消时间
     */
    public void setInitialLongest(String initialLongest) {
        this.initialLongest = initialLongest;
    }

    /**
     * 酶洗正常洗消时间
     */
    public String getEnzymeNormal() {
        return this.enzymeNormal;
    }

    /**
     * 酶洗正常洗消时间
     */
    public void setEnzymeNormal(String enzymeNormal) {
        this.enzymeNormal = enzymeNormal;
    }

    /**
     * 酶洗最长清洗时间
     */
    public String getEnzymeLongest() {
        return this.enzymeLongest;
    }

    /**
     * 酶洗最长清洗时间
     */
    public void setEnzymeLongest(String enzymeLongest) {
        this.enzymeLongest = enzymeLongest;
    }

    /**
     * 次洗正常洗消时间
     */
    public String getSecondNormal() {
        return this.secondNormal;
    }

    /**
     * 次洗正常洗消时间
     */
    public void setSecondNormal(String secondNormal) {
        this.secondNormal = secondNormal;
    }

    /**
     * 次洗最长清洗时间
     */
    public String getSecondLongest() {
        return this.secondLongest;
    }

    /**
     * 次洗最长清洗时间
     */
    public void setSecondLongest(String secondLongest) {
        this.secondLongest = secondLongest;
    }

    /**
     * 浸泡正常洗消时间
     */
    public String getSoakNormal() {
        return this.soakNormal;
    }

    /**
     * 浸泡正常洗消时间
     */
    public void setSoakNormal(String soakNormal) {
        this.soakNormal = soakNormal;
    }

    /**
     * 浸泡最长清洗时间
     */
    public String getSoakLongest() {
        return this.soakLongest;
    }

    /**
     * 浸泡最长清洗时间
     */
    public void setSoakLongest(String soakLongest) {
        this.soakLongest = soakLongest;
    }

    /**
     * 末洗正常洗消时间
     */
    public String getEndNormal() {
        return this.endNormal;
    }

    /**
     * 末洗正常洗消时间
     */
    public void setEndNormal(String endNormal) {
        this.endNormal = endNormal;
    }

    /**
     * 末洗最长清洗时间
     */
    public String getEndLongest() {
        return this.endLongest;
    }

    /**
     * 末洗最长清洗时间
     */
    public void setEndLongest(String endLongest) {
        this.endLongest = endLongest;
    }

    /**
     * 干燥正常时间
     */
    public String getDryNormal() {
        return this.dryNormal;
    }

    /**
     * 干燥正常时间
     */
    public void setDryNormal(String dryNormal) {
        this.dryNormal = dryNormal;
    }

    /**
     * 干燥最长时间
     */
    public String getDryLongest() {
        return this.dryLongest;
    }

    /**
     * 干燥最长时间
     */
    public void setDryLongest(String dryLongest) {
        this.dryLongest = dryLongest;
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
     * 最后更新时间
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}