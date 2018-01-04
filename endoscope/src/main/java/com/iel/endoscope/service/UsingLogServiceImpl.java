package com.iel.endoscope.service;

import com.iel.endoscope.dao.UsingLogDAO;
import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by wwg on 2018/1/3.
 */
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
    public int findCountsUnderCertainTime(Timestamp startTime, Timestamp endTime) {
        int counts = usingLogDAO.findCountsUnderCertainTime(startTime, endTime);
        return counts;
    }
}
