package com.iel.endoscope.dao;

import com.iel.endoscope.entity.Process;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface ProcessDAO {
    int deleteByPrimaryKey(Long processId);

    void insert(Process record);

    void insertSelective(Process record);

    void insertBatch(List<Process> records);

    Process selectByPrimaryKey(Long processId);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);

    List<Process> findAll();
}