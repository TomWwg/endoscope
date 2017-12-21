package com.iel.endoscope.service;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.entity.Device;
import com.iel.endoscope.util.Page;

import java.util.List;

/**
 * 设备相关的接口
 * Created by wwg on 2017/11/30.
 * @author wwg
 */
public interface DeviceService {

    /**
     * 通过主键删除设备
     * @param deviceId
     * @return
     */
    int deleteByPrimaryKey(Long deviceId);

    /**
     * 新增设备信息
     * @param record
     */
    void insert(Device record);

    /**
     * 选择性新增信息
     * @param record
     */
    void insertSelective(Device record);

    /**
     * 批量添加
     * @param records
     */
    void insertBatch(List<Device> records);

    /**
     * 通过主键删除设备信息
     * @param deviceId
     * @return
     */
    Device selectByPrimaryKey(Long deviceId);

    /**
     * 根据主键选择性更新设备信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Device record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Device record);

    /**
     * 通过stationId查找该科室下的设备信息并分页
     * @param stationId
     * @param page
     * @return
     */
    PageInfo<Device> findDevicesByStationIdByPage(Long stationId, Page page);
}
