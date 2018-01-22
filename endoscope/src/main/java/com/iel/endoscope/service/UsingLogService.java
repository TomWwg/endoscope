package com.iel.endoscope.service;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;
import com.iel.endoscope.util.Page;

import java.util.List;

/**
 * Created by wwg on 2018/1/3.
 */
public interface UsingLogService {

    int deleteByPrimaryKey(Long usingLogId);

    void insert(UsingLog record);

    void insertSelective(UsingLog record);

    void insertBatch(List<UsingLog> records);

    UsingLog selectByPrimaryKey(Long usingLogId);

    int updateByPrimaryKeySelective(UsingLog record);

    int updateByPrimaryKey(UsingLog record);

    List<UsingLogReturn> findByENumberAndENameAndETypeAndTime(UsingLogReturn record);

    int findCountsUnderCertainTime(UsingLogReturn record);

    PageInfo<UsingLogReturn> findUsingLogByManyParameters(UsingLogReturn record, Page page);
}
