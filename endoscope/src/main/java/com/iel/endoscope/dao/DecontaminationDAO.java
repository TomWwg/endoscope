package com.iel.endoscope.dao;

import com.iel.endoscope.entity.Decontamination;

import java.util.List;

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
}