package com.iel.endoscope.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iel.endoscope.dao.DeviceDAO;
import com.iel.endoscope.entity.Device;
import com.iel.endoscope.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备接口的实现类
 * Created by wwg on 2017/11/30.
 * @author wwg
 */
@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceDAO deviceDAO;

    @Override
    public int deleteByPrimaryKey(Long deviceId) {
        deviceDAO.deleteByPrimaryKey(deviceId);
        return 1;
    }

    @Override
    public void insert(Device record) {
        deviceDAO.insert(record);
    }

    @Override
    public void insertSelective(Device record) {
        deviceDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Device> records) {
        deviceDAO.insertBatch(records);
    }

    @Override
    public Device selectByPrimaryKey(Long deviceId) {
        Device device = deviceDAO.selectByPrimaryKey(deviceId);
        return device;
    }

    @Override
    public int updateByPrimaryKeySelective(Device record) {
        deviceDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Device record) {
        deviceDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public PageInfo<Device> findDevicesByStationIdByPage(Long stationId, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Device> devices = deviceDAO.findDevicesByStationId(stationId);
        PageInfo<Device> pageInfo = new PageInfo<>(devices);
        return pageInfo;
    }

    @Override
    public List<Device> findDevicesWithoutStationId() {
        List<Device> devices = deviceDAO.findDevicesWithoutStationId();
        return devices;
    }
}
