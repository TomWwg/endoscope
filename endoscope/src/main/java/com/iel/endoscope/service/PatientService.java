package com.iel.endoscope.service;

import com.iel.endoscope.entity.Patient;

import java.util.List;

/**
 * 病人的接口
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public interface PatientService {

    /**
     * 根据patient删除对应的病人信息
     * @param patientId
     * @return
     */
    int deleteByPrimaryKey(Long patientId);

    /**
     * 插入病人信息
     * @param record
     */
    void insert(Patient record);

    /**
     * 选择性插入病人信息
     * @param record
     */
    void insertSelective(Patient record);

    /**
     * 批量插入病人信息
     * @param records
     */
    void insertBatch(List<Patient> records);

    /**
     * 通过patientId查找对应的病人信息
     * @param patientId
     * @return
     */
    Patient selectByPrimaryKey(Long patientId);

    /**
     * 选择性更新病人信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Patient record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Patient record);
}
