package com.iel.endoscope.service;

import com.iel.endoscope.entity.Process;

import java.util.List;

/**
 * Created by wwg on 2017/12/22.
 */
public interface ProcessService {

    /**
     * 通过主键删除对应的流程
     * @param processId
     * @return
     */
    int deleteByPrimaryKey(Long processId);

    /**
     * 新增
     * @param record
     */
    void insert(Process record);

    /**
     * 选择性添加
     * @param record
     */
    void insertSelective(Process record);

    /**
     * 批量添加
     * @param records
     */
    void insertBatch(List<Process> records);

    /**
     * 通过主键查询对应的流程信息
     * @param processId
     * @return
     */
    Process selectByPrimaryKey(Long processId);

    /**
     * 选择性更新流程信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Process record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Process record);

    /**
     * 查找所有的流程信息
     * @return
     */
    List<Process> findAll();
}
