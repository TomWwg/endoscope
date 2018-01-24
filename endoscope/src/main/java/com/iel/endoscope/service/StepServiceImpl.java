package com.iel.endoscope.service;

import com.iel.endoscope.dao.StepDAO;
import com.iel.endoscope.entity.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2018/1/23.
 */
@Service("stepService")
public class StepServiceImpl implements StepService {

    @Autowired
    private StepDAO stepDAO;

    @Override
    public int deleteByPrimaryKey(Long stepId) {
        stepDAO.deleteByPrimaryKey(stepId);
        return 1;
    }

    @Override
    public void insert(Step record) {
        stepDAO.insert(record);
    }

    @Override
    public void insertSelective(Step record) {
        stepDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Step> records) {
        stepDAO.insertBatch(records);
    }

    @Override
    public Step selectByPrimaryKey(Long stepId) {
        Step step = stepDAO.selectByPrimaryKey(stepId);
        return step;
    }

    @Override
    public int updateByPrimaryKeySelective(Step record) {
        stepDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Step record) {
        stepDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<Step> findByDecontaminationId(Long decontaminationId) {
        List<Step> steps = stepDAO.findByDecontaminationId(decontaminationId);
        return steps;
    }

    @Override
    public List<Step> findAll() {
        List<Step> steps = stepDAO.findAll();
        return steps;
    }

    @Override
    public int updateByPrimaryKeyAndStepTypeSelective(Step record) {
        return stepDAO.updateByPrimaryKeyAndStepTypeSelective(record);
    }
}
