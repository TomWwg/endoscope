package com.iel.endoscope.service;

import com.iel.endoscope.dao.*;
import com.iel.endoscope.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Autowired
    private EndoscopeDAO endoscopeDAO;

    @Autowired
    private StepDAO stepDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private StationDAO stationDAO;

    @Override
    public int deleteByPrimaryKey(Long decontaminationId) {
        decontaminationDAO.deleteByPrimaryKey(decontaminationId);
        return 1;
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
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Decontamination record) {
        decontaminationDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<DecontaminationRealTime> findDecontaminationRealTime() {
        List<DecontaminationRealTime> decontaminationRealTimes = new ArrayList<>();
        List<Decontamination> decontaminations = decontaminationDAO.findDecontaminationsNoResult();
        if(decontaminations != null && decontaminations.size() > 0){
            DecontaminationRealTime decontaminationRealTime = new DecontaminationRealTime();
            Decontamination decontamination = new Decontamination();
            Endoscope endoscope = new Endoscope();
            List<Step> steps = new ArrayList<>();
            Employee employee = new Employee();
            Station station = new Station();
            for (int i = 0; i < decontaminations.size(); i++){
                decontamination = decontaminations.get(i);
                endoscope = endoscopeDAO.selectByPrimaryKey(decontamination.getEndoscopeId());
                steps = stepDAO.findByDecontaminationId(decontamination.getDecontaminationId());
                employee = employeeDAO.selectByPrimaryKey(decontamination.getEmployeeId());
                station = stationDAO.selectByPrimaryKey(decontamination.getStationId());
                decontaminationRealTime.setEndoscopeNumber(endoscope.getEndoscopeNumber());
                decontaminationRealTime.setEndoscopeType(endoscope.getEndoscopeType());
                decontaminationRealTime.setSteps(steps);
                decontaminationRealTime.setEmployeeName(employee.getEmployeeName());
                decontaminationRealTime.setStationName(station.getStationName());
                decontaminationRealTimes.add(decontaminationRealTime);
            }
        }
        return decontaminationRealTimes;
    }
}
