package com.iel.endoscope.dao;


import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;

import java.util.List;
import java.util.Map;

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

    int findCountsUnderCertainTime(Map<String, Object> map);

    /**
     * 根据内镜Id/内镜编号/内镜名称/洗消人员Id/起止时间查询对应的内镜使用日志信息
     * （endoscopeId/endoscopeNumber/endoscopeName/employeeId/startTime、endTime）
     * @param map
     * @return
     */
    List<UsingLogReturn> findUsingLogByManyParameters(Map<String, Object> map);

    /**
     * 通过内镜Id查找给内镜的使用信息（距离当前时间最近的内镜使用信息）
     * @param endoscopeId
     * @return
     */
    List<UsingLogReturn> findLatestUsingLogByEndoscopeId(Long endoscopeId);
}