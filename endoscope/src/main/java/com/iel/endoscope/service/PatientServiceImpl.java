package com.iel.endoscope.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iel.endoscope.dao.PatientDAO;
import com.iel.endoscope.entity.Patient;
import com.iel.endoscope.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 病人接口的实现类
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
@Service("patientService")
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDAO patientDAO;

    @Override
    public int deleteByPrimaryKey(Long patientId) {
        patientDAO.deleteByPrimaryKey(patientId);
        return 1;
    }

    @Override
    public void insert(Patient record) {
        patientDAO.insert(record);
    }

    @Override
    public void insertSelective(Patient record) {
        patientDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Patient> records) {
        patientDAO.insertBatch(records);
    }

    @Override
    public Patient selectByPrimaryKey(Long patientId) {
        Patient patient = patientDAO.selectByPrimaryKey(patientId);
        return patient;
    }

    @Override
    public int updateByPrimaryKeySelective(Patient record) {
        patientDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Patient record) {
        patientDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public PageInfo<Patient> findAllByPage(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Patient> list = patientDAO.findAll();
        PageInfo<Patient> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Patient> findByPatientNameByPage(String patientName, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Patient> list = patientDAO.findByPatientName(patientName);
        PageInfo<Patient> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
