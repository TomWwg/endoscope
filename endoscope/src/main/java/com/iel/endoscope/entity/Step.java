package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date startTime;
    // 结束时间
    private Date endTime;

    // Constructors

    /**
     * default constructor
     */
    public Step() {
    }

    /**
     * full constructor
     */
    public Step(Long decontaminationId, String stepType, Date startTime, Date endTime) {
        this.decontaminationId = decontaminationId;
        this.stepType = stepType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Property accessors

    /**
     * 单步洗消ID
     */
    public Long getStepId() {
        return this.stepId;
    }

    /**
     * 单步洗消ID
     */
    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    /**
     * 手工洗消日志ID
     */
    public Long getDecontaminationId() {
        return this.decontaminationId;
    }

    /**
     * 手工洗消日志ID
     */
    public void setDecontaminationId(Long decontaminationId) {
        this.decontaminationId = decontaminationId;
    }

    /**
     * 洗消步骤
     */
    public String getStepType() {
        return this.stepType;
    }

    /**
     * 洗消步骤
     */
    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    /**
     * 开始时间
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束时间
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}