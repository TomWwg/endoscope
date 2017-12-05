package com.iel.endoscope.service;

import com.iel.endoscope.entity.Decontamination;

import java.util.List;

/**
 * 洗消日志接口类
 * Created by wwg on 2017/12/5.
 * @author wwg
 */
public interface DecontaminationService {

    /**
     * 通过主键删除对应的洗消日志信息
     * @param decontaminationId
     * @return
     */
    int deleteByPrimaryKey(Long decontaminationId);

    /**
     * 插入洗消日志信息
     * @param record
     */
    void insert(Decontamination record);

    /**
     * 选择性添加洗消日志信息
     * @param record
     */
    void insertSelective(Decontamination record);

    /**
     * 批量添加
     * @param records
     */
    void insertBatch(List<Decontamination> records);

    /**
     * 通过主键查找对应的洗消日志信息
     * @param decontaminationId
     * @return
     */
    Decontamination selectByPrimaryKey(Long decontaminationId);

    /**
     * 选择性更新洗消日志信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Decontamination record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Decontamination record);
}
