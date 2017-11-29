package com.iel.endoscope.service;

import com.iel.endoscope.dao.HospitalDAO;
import com.iel.endoscope.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/11/29.
 * @author wwg
 */
@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalDAO hospitalDAO;

    @Override
    public int deleteByPrimaryKey(Long hospitalId) {
        hospitalDAO.deleteByPrimaryKey(hospitalId);
        return 0;
    }

    @Override
    public void insert(Hospital record) {
        hospitalDAO.insert(record);
    }

    @Override
    public void insertSelective(Hospital record) {
        hospitalDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Hospital> records) {
        hospitalDAO.insertBatch(records);
    }

    @Override
    public Hospital selectByPrimaryKey(Long hospitalId) {
        Hospital hospital = hospitalDAO.selectByPrimaryKey(hospitalId);
        return hospital;
    }

    @Override
    public int updateByPrimaryKeySelective(Hospital record) {
        hospitalDAO.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Hospital record) {
        hospitalDAO.updateByPrimaryKey(record);
        return 0;
    }
}
