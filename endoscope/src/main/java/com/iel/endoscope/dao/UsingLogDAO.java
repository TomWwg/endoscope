package com.iel.endoscope.dao;


import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface UsingLogDAO {
    int deleteByPrimaryKey(Long usingLogId);

    void insert(UsingLog record);

    void insertSelective(UsingLog record);

    void insertBatch(List<UsingLog> records);

    UsingLog selectByPrimaryKey(Long usingLogId);

    int updateByPrimaryKeySelective(UsingLog record);

    int updateByPrimaryKey(UsingLog record);

    List<UsingLogReturn> findByENumberAndENameAndETypeAndTime(UsingLogReturn record);

    int findCountsUnderCertainTime(Timestamp startTime, Timestamp endTime);
}