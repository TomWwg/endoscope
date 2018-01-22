package com.iel.endoscope.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iel.endoscope.dao.*;
import com.iel.endoscope.entity.*;
import com.iel.endoscope.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

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

    @Override
    public List<DecontaminationWork> findWorkloadStatistics(Map<String, Object> map) {
        List<DecontaminationWork> decontaminationWorks = decontaminationDAO.findWorkloadStatistics(map);
        int total = decontaminationWorks.size();
        Set<DecontaminationWork> set = new HashSet<>();
        set.addAll(decontaminationWorks);
        List<DecontaminationWork> list = new ArrayList<>();
        list.addAll(set);
        for(int i = 0; i < list.size(); i++) {
            int cleaningNumber = 0;
            DecontaminationWork val = list.get(i);
            for (int j = 0; j < decontaminationWorks.size(); j++) {
                if (val.getEmployeeNumber().equals(decontaminationWorks.get(j).getEmployeeNumber())) {
                    cleaningNumber++;
                }
            }
            val.setCleaningNumber(cleaningNumber);
            val.setCleaningPercent(new BigDecimal((float) cleaningNumber * 100 / total).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() + "%");
        }
        return list;
    }

    @Override
    public PageInfo<DecontaminationLog> findDecontaminationLog(Map<String, Object> map, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<DecontaminationLog> list = decontaminationDAO.findDecontaminationLog(map);
        List<Step> steps = stepDAO.findAll();
        for(int i = 0; i < list.size(); i++){
            DecontaminationLog decontaminationLog = list.get(i);
            Map<String, String> stepMap = new HashMap<>();
            for(int j = 0; j < steps.size(); j++){
                Step step = steps.get(j);
                if(decontaminationLog.getDecontaminationId().equals(step.getDecontaminationId())){
                    stepMap.put(step.getStepType(), step.getCostTime());
                    decontaminationLog.setSteps(stepMap);
                }
            }
        }
        PageInfo<DecontaminationLog> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
