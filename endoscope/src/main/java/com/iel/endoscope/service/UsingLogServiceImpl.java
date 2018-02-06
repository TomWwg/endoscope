package com.iel.endoscope.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iel.endoscope.dao.UsingLogDAO;
import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;
import com.iel.endoscope.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wwg on 2018/1/3.
 */
@Service("usingLogService")
public class UsingLogServiceImpl implements UsingLogService {

    @Autowired
    private UsingLogDAO usingLogDAO;

    @Override
    public int deleteByPrimaryKey(Long usingLogId) {
        usingLogDAO.deleteByPrimaryKey(usingLogId);
        return 1;
    }

    @Override
    public void insert(UsingLog record) {
        usingLogDAO.insert(record);
    }

    @Override
    public void insertSelective(UsingLog record) {
        usingLogDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<UsingLog> records) {
        usingLogDAO.insertBatch(records);
    }

    @Override
    public UsingLog selectByPrimaryKey(Long usingLogId) {
        return usingLogDAO.selectByPrimaryKey(usingLogId);
    }

    @Override
    public int updateByPrimaryKeySelective(UsingLog record) {
        usingLogDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(UsingLog record) {
        usingLogDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<UsingLogReturn> findByENumberAndENameAndETypeAndTime(UsingLogReturn record) {
        return usingLogDAO.findByENumberAndENameAndETypeAndTime(record);
    }

    @Override
    public int findCountsUnderCertainTime(UsingLogReturn record){
        Map<String, Object> map = new HashMap<>();
        map.put("startTime", record.getStartTime());
        map.put("endTime", record.getEndTime());
        int counts = usingLogDAO.findCountsUnderCertainTime(map);
        return counts;
    }

    @Override
    public PageInfo<UsingLogReturn> findUsingLogByManyParameters(UsingLogReturn record, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map<String, Object> map = new HashMap<>();
        if(record.getEndoscopeType() != null){
            map.put("endoscopeType", record.getEndoscopeType());
        }
        if(record.getEndoscopeNumber() != null){
            map.put("endoscopeNumber", record.getEndoscopeNumber());
        }
        if(record.getEndoscopeName() != null){
            map.put("endoscopeName", record.getEndoscopeName());
        }
        if(record.getEmployeeId() != null){
            map.put("employeeId", record.getEmployeeId());
        }
        map.put("startTime", record.getStartTime());
        map.put("endTime", record.getEndTime());
        List<UsingLogReturn> list = usingLogDAO.findUsingLogByManyParameters(map);
        PageInfo<UsingLogReturn> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public UsingLogReturn findLatestUsingLogByEndoscopeId(Long endoscopeId) {
        List<UsingLogReturn> list = usingLogDAO.findLatestUsingLogByEndoscopeId(endoscopeId);
        UsingLogReturn usingLogReturn = list.get(0);

        if(list.size() == 2){
            usingLogReturn.setLastPatient(list.get(1).getPatientName());
            usingLogReturn.setLastUsingTime(list.get(1).getUsingTime());
        }
        return usingLogReturn;
    }

    @Override
    public List<Long> findEndoscopeIdByPatientId(Long patientId) {
        List<Long> endoscopeIds = usingLogDAO.findEndoscopeIdByPatientId(patientId);
        return endoscopeIds;
    }
}
