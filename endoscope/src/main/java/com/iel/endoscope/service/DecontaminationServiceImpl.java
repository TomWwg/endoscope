package com.iel.endoscope.service;

import com.iel.endoscope.dao.DecontaminationDAO;
import com.iel.endoscope.entity.Decontamination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 洗消日志的实现类
 * Created by wwg on 2017/12/5.
 * @author wwg
 */
@Service("decontaminationService")
public class DecontaminationServiceImpl implements DecontaminationService {

    @Autowired
    private DecontaminationDAO decontaminationDAO;

    @Override
    public int deleteByPrimaryKey(Long decontaminationId) {
        decontaminationDAO.deleteByPrimaryKey(decontaminationId);
        return 0;
    }

    @Override
    public void insert(Decontamination record) {
        decontaminationDAO.insert(record);
    }

    @Override
    public void insertSelective(Decontamination record) {
        decontaminationDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Decontamination> records) {
        decontaminationDAO.insertBatch(records);
    }

    @Override
    public Decontamination selectByPrimaryKey(Long decontaminationId) {
        Decontamination decontamination = decontaminationDAO.selectByPrimaryKey(decontaminationId);
        return decontamination;
    }

    @Override
    public int updateByPrimaryKeySelective(Decontamination record) {
        decontaminationDAO.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Decontamination record) {
        decontaminationDAO.updateByPrimaryKey(record);
        return 0;
    }
}
