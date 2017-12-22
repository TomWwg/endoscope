package com.iel.endoscope.service;


import com.iel.endoscope.dao.ProcessDAO;
import com.iel.endoscope.entity.Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 流程信息接口的实现类
 * Created by wwg on 2017/12/22.
 * @author wwg
 */
@Service("processService")
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessDAO processDAO;

    @Override
    public int deleteByPrimaryKey(Long processId) {
        processDAO.deleteByPrimaryKey(processId);
        return 1;
    }

    @Override
    public void insert(Process record) {
        processDAO.insert(record);
    }

    @Override
    public void insertSelective(Process record) {
        processDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Process> records) {
        processDAO.insertBatch(records);
    }

    @Override
    public Process selectByPrimaryKey(Long processId) {
        Process process = processDAO.selectByPrimaryKey(processId);
        return process;
    }

    @Override
    public int updateByPrimaryKeySelective(Process record) {
        processDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Process record) {
        processDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<Process> findAll() {
        List<Process> processes = processDAO.findAll();
        return processes;
    }
}
