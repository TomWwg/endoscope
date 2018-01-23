package com.iel.endoscope.service;

import com.iel.endoscope.entity.Step;

import java.util.List;

/**
 * Created by wwg on 2018/1/23.
 */
public interface StepService {
    int deleteByPrimaryKey(Long stepId);

    void insert(Step record);

    void insertSelective(Step record);

    void insertBatch(List<Step> records);

    Step selectByPrimaryKey(Long stepId);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);

    List<Step> findByDecontaminationId(Long decontaminationId);

    List<Step> findAll();

}
