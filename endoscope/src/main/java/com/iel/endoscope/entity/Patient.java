package com.iel.endoscope.entity;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Patient implements java.io.Serializable {

    // Fields

    // 患者ID
    private Long patientId;
    // 就诊号
    private String visitNumber;
    // 患者姓名
    private String patientName;
    // 备注
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public Patient() {
    }

    /**
     * full constructor
     */
    public Patient(String visitNumber, String patientName, String remark) {
        this.visitNumber = visitNumber;
        this.patientName = patientName;
        this.remark = remark;
    }

    // Property accessors

    /**
     * 患者ID
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * 患者ID
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * 就诊号
     */
    public String getVisitNumber() {
        return this.visitNumber;
    }

    /**
     * 就诊号
     */
    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }

    /**
     * 患者姓名
     */
    public String getPatientName() {
        return this.patientName;
    }

    /**
     * 患者姓名
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

}