package com.iel.endoscope.dao;


import com.iel.endoscope.entity.Station;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface StationDAO {
    int deleteByPrimaryKey(Long stationId);

    void insert(Station record);

    void insertSelective(Station record);

    void insertBatch(List<Station> records);

    Station selectByPrimaryKey(Long stationId);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}