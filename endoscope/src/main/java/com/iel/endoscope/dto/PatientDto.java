package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Patient;

/**
 * 病人的传入参数转换
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public class PatientDto extends PageDto {

    /**
     * 患者ID
     */
    private Long patientId;

    /**
     * 就诊号
     */
    private String visitNumber;

    /**
     * 患者姓名
     */
    private String patientName;

    /**
     * 备注
     */
    private String remark;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static Patient form(PatientDto dto){
        Patient patient = null;
        if(dto != null){
            patient = new Patient();
            patient.setPatientId(dto.getPatientId());
            patient.setVisitNumber(dto.getVisitNumber());
            patient.setPatientName(dto.getPatientName());
            patient.setRemark(dto.getRemark());
        }
        return patient;
    }
}
