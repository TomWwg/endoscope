package com.iel.endoscope.dao;


import com.iel.endoscope.entity.Endoscope;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 * @author wwg
 */
public interface EndoscopeDAO {
    int deleteByPrimaryKey(Long endoscopeId);

    void insert(Endoscope record);

    void insertSelective(Endoscope record);

    void insertBatch(List<Endoscope> records);

    Endoscope selectByPrimaryKey(Long endoscopeId);

    int updateByPrimaryKeySelective(Endoscope record);

    int updateByPrimaryKey(Endoscope record);

    List<Endoscope> findByEndoscopeType(Endoscope record);

    List<Endoscope> findAll();
}