package com.iel.endoscope.service;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.entity.Decontamination;
import com.iel.endoscope.entity.DecontaminationLog;
import com.iel.endoscope.entity.DecontaminationRealTime;
import com.iel.endoscope.entity.DecontaminationWork;
import com.iel.endoscope.util.Page;

import java.util.List;
import java.util.Map;

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

    /**
     * 手工洗消的实时监控接口
     * 该接口的返回类型与之前不同
     * @return
     */
    List<DecontaminationRealTime> findDecontaminationRealTime();

    /**
     * 工作量统计页面的查询接口
     * 通过工号、姓名、角色、起止时间查询对应的员工工作量统计信息
     * @param map
     * @return
     */
    List<DecontaminationWork> findWorkloadStatistics(Map<String, Object> map);

    /**
     * 手工洗消日志页面
     * 根据内镜编号/内镜名称/内镜类型/洗消人员/审核结果/开始时间、结束时间查询对应的手工洗消日志信息
     * @param map
     * @return
     */
    PageInfo<DecontaminationLog> findDecontaminationLog(Map<String, Object> map, Page page);
}
