package com.iel.endoscope.service;

import com.iel.endoscope.dao.StationDAO;
import com.iel.endoscope.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 工作站接口的实现类
 * Created by wwg on 2017/11/30.
 * @author wwg
 */
@Service("stationService")
public class StationServiceImpl implements StationService {

    @Autowired
    private StationDAO stationDAO;

    @Override
    public int deleteByPrimaryKey(Long stationId) {
        stationDAO.deleteByPrimaryKey(stationId);
        return 1;
    }

    @Override
    public void insert(Station record) {
        stationDAO.insert(record);
    }

    @Override
    public void insertSelective(Station record) {
        stationDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Station> records) {
        stationDAO.insertBatch(records);
    }

    @Override
    public Station selectByPrimaryKey(Long stationId) {
        Station station = stationDAO.selectByPrimaryKey(stationId);
        return station;
    }

    @Override
    public int updateByPrimaryKeySelective(Station record) {
        stationDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Station record) {
        stationDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<Station> findAll() {
        List<Station> stations = new ArrayList<>();
        stations = stationDAO.findAll();
        return stations;
    }
}
