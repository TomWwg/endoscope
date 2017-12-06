package com.iel.endoscope.service;

import com.iel.endoscope.entity.LoginLog;

import java.util.List;

/**
 * 登陆日志的参数转换
 * Created by wwg on 2017/12/6.
 * @author wwg
 */
public interface LoginLogService {

    /**
     * 通过主键删除对应的登陆日志信息
     * @param loginLogId
     * @return
     */
    int deleteByPrimaryKey(Long loginLogId);

    /**
     * 添加登陆日志信息
     * @param record
     */
    void insert(LoginLog record);

    /**
     * 选择性添加登陆日志信息
     * @param record
     */
    void insertSelective(LoginLog record);

    /**
     * 批量添加
     * @param records
     */
    void insertBatch(List<LoginLog> records);

    /**
     * 通过主键查询对应的登陆日志信息
     * @param loginLogId
     * @return
     */
    LoginLog selectByPrimaryKey(Long loginLogId);

    /**
     * 选择性更新登陆日志信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(LoginLog record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(LoginLog record);
}
