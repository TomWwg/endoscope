package com.iel.endoscope.dao;

import com.iel.endoscope.entity.LoginLog;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface LoginLogDAO {
    int deleteByPrimaryKey(Long loginLogId);

    void insert(LoginLog record);

    void insertSelective(LoginLog record);

    void insertBatch(List<LoginLog> records);

    LoginLog selectByPrimaryKey(Long loginLogId);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}