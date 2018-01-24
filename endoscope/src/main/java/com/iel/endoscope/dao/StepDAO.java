package com.iel.endoscope.dao;


import com.iel.endoscope.entity.Step;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface StepDAO {
    int deleteByPrimaryKey(Long stepId);

    void insert(Step record);

    void insertSelective(Step record);

    void insertBatch(List<Step> records);

    Step selectByPrimaryKey(Long stepId);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);

    List<Step> findByDecontaminationId(Long decontaminationId);

    List<Step> findAll();

    int updateByPrimaryKeyAndStepTypeSelective(Step record);
}