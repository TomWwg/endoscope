package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Step implements java.io.Serializable {

    // Fields

    // 单步洗消ID
    private Long stepId;
    // 手工洗消日志ID
    private Long decontaminationId;
    // 洗消步骤
    private String stepType;
    // 开始时间
    private Timestamp startTime;
    // 结束时间
    private Timestamp endTime;
    //耗时
    private String costTime;

    // Constructors

    /**
     * default constructor
     */
    public Step() {
    }

    /**
     * full constructor
     */
    public Step(Long decontaminationId, String stepType, Timestamp startTime, Timestamp endTime, String costTime) {
        this.decontaminationId = decontaminationId;
        this.stepType = stepType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.costTime = costTime;
    }

    // Property accessors

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public Long getDecontaminationId() {
        return decontaminationId;
    }

    public void setDecontaminationId(Long decontaminationId) {
        this.decontaminationId = decontaminationId;
    }

    public String getStepType() {
        return stepType;
    }

    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }
}