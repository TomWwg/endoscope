package com.iel.endoscope.service;

import com.iel.endoscope.entity.Station;

import java.util.List;

/**
 * 工作站接口
 * Created by wwg on 2017/11/30.
 */
public interface StationService {

    /**
     * 通过stationId删除对应的工作站
     * @param stationId
     * @return
     */
    int deleteByPrimaryKey(Long stationId);

    /**
     * 插入工作站信息
     * @param record
     */
    void insert(Station record);

    /**
     * 选择性插入工作站信息
     * @param record
     */
    void insertSelective(Station record);

    /**
     * 批量插入工作站信息
     * @param records
     */
    void insertBatch(List<Station> records);

    /**
     * 通过主键查找工作站信息
     * @param stationId
     * @return
     */
    Station selectByPrimaryKey(Long stationId);

    /**
     * 选择性更新工作站信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Station record);

    /**
     * 更新工作站信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Station record);
}
