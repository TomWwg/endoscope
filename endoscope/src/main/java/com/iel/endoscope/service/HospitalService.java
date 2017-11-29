package com.iel.endoscope.service;

import com.iel.endoscope.entity.Hospital;

import java.util.List;

/**
 * Created by wwg on 2017/11/29.
 * @author wwg
 */
public interface HospitalService {

    /**
     * 根据hospitalId删除医院
     * @param hospitalId
     * @return
     */
    int deleteByPrimaryKey(Long hospitalId);

    /**
     * 插入医院信息
     * @param record
     */
    void insert(Hospital record);

    /**
     * 选择性插入医院信息（不一定要插入全部字段）
     * @param record
     */
    void insertSelective(Hospital record);

    /**
     * 批量插入医院信息
     * @param records
     */
    void insertBatch(List<Hospital> records);

    /**
     * 通过hospitalId查询该医院信息
     * @param hospitalId
     * @return
     */
    Hospital selectByPrimaryKey(Long hospitalId);

    /**
     * 根据hospitalId和传进来的参数选择性更新医院的信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Hospital record);

    /**
     * 根据hospitalId更新医院信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Hospital record);
}
