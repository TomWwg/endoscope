package com.iel.endoscope.service;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.entity.Endoscope;
import com.iel.endoscope.util.Page;

import java.util.List;

/**
 * 内镜相关接口
 * Created by wwg on 2017/12/5.
 * @author wwg
 */
public interface EndoscopeService {

    /**
     * 通过主键删除对应的内镜信息
     * @param endoscopeId
     * @return
     */
    int deleteByPrimaryKey(Long endoscopeId);

    /**
     * 插入内镜信息
     * @param record
     */
    void insert(Endoscope record);

    /**
     * 选择性添加内镜信息
     * @param record
     */
    void insertSelective(Endoscope record);

    /**
     * 批量添加
     * @param records
     */
    void insertBatch(List<Endoscope> records);

    /**
     * 通过主键查找对应的内镜信息
     * @param endoscopeId
     * @return
     */
    Endoscope selectByPrimaryKey(Long endoscopeId);

    /**
     * 选择性更新内镜信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Endoscope record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Endoscope record);

    /**
     * 通过内镜类型查询内镜信息（可传可不传）
     * @param record
     * @return
     */
    List<Endoscope> findByEndoscopeType(Endoscope record);

    /**
     * 分页查询所有的内镜信息
     * @param page
     * @return
     */
    PageInfo<Endoscope> findAllByPage(Page page);
}
