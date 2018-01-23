package com.iel.endoscope.dao;

import com.iel.endoscope.entity.Decontamination;
import com.iel.endoscope.entity.DecontaminationLog;
import com.iel.endoscope.entity.DecontaminationWork;

import java.util.List;
import java.util.Map;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface DecontaminationDAO {
    int deleteByPrimaryKey(Long decontaminationId);

    void insert(Decontamination record);

    void insertSelective(Decontamination record);

    void insertBatch(List<Decontamination> records);

    Decontamination selectByPrimaryKey(Long decontaminationId);

    int updateByPrimaryKeySelective(Decontamination record);

    int updateByPrimaryKey(Decontamination record);

    List<Decontamination> findDecontaminationsNoResult();

    List<DecontaminationWork> findWorkloadStatistics(Map<String, Object> map);

    List<DecontaminationLog> findDecontaminationLog(Map<String, Object> map);

    List<DecontaminationLog> findDecontaminationLogByEndoscopeId(Long endoscopeId);

    List<DecontaminationLog> findDecontaminationLogByAuditResult(String auditResult);

    Long insertDecontaminationSelective(Decontamination record);
}