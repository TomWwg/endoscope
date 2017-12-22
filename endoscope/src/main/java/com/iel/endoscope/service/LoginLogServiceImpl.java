package com.iel.endoscope.service;

import com.iel.endoscope.dao.LoginLogDAO;
import com.iel.endoscope.entity.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登陆日志接口的实现类
 * Created by wwg on 2017/12/6.
 * @author wwg
 */
@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogDAO loginLogDAO;

    @Override
    public int deleteByPrimaryKey(Long loginLogId) {
        loginLogDAO.deleteByPrimaryKey(loginLogId);
        return 1;
    }

    @Override
    public void insert(LoginLog record) {
        loginLogDAO.insert(record);
    }

    @Override
    public void insertSelective(LoginLog record) {
        loginLogDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<LoginLog> records) {
        loginLogDAO.insertBatch(records);
    }

    @Override
    public LoginLog selectByPrimaryKey(Long loginLogId) {
        LoginLog loginLog = loginLogDAO.selectByPrimaryKey(loginLogId);
        return loginLog;
    }

    @Override
    public int updateByPrimaryKeySelective(LoginLog record) {
        loginLogDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(LoginLog record) {
        loginLogDAO.updateByPrimaryKey(record);
        return 1;
    }
}
