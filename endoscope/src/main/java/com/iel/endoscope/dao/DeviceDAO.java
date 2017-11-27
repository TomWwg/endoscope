package com.iel.endoscope.dao;


import com.iel.endoscope.entity.Device;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface DeviceDAO {
    int deleteByPrimaryKey(Long deviceId);

    void insert(Device record);

    void insertSelective(Device record);

    void insertBatch(List<Device> records);

    Device selectByPrimaryKey(Long deviceId);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}