package com.iel.endoscope.service;

import com.iel.endoscope.dao.EndoscopeDAO;
import com.iel.endoscope.entity.Endoscope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 内镜接口的实现类
 * Created by wwg on 2017/12/5.
 * @author wwg
 */
@Service("endoscopeService")
public class EndoscopeServiceImpl implements EndoscopeService {

    @Autowired
    private EndoscopeDAO endoscopeDAO;

    @Override
    public int deleteByPrimaryKey(Long endoscopeId) {
        endoscopeDAO.deleteByPrimaryKey(endoscopeId);
        return 0;
    }

    @Override
    public void insert(Endoscope record) {
        endoscopeDAO.insert(record);
    }

    @Override
    public void insertSelective(Endoscope record) {
        endoscopeDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Endoscope> records) {
        endoscopeDAO.insertBatch(records);
    }

    @Override
    public Endoscope selectByPrimaryKey(Long endoscopeId) {
        Endoscope endoscope = endoscopeDAO.selectByPrimaryKey(endoscopeId);
        return endoscope;
    }

    @Override
    public int updateByPrimaryKeySelective(Endoscope record) {
        endoscopeDAO.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Endoscope record) {
        endoscopeDAO.updateByPrimaryKey(record);
        return 0;
    }
}
