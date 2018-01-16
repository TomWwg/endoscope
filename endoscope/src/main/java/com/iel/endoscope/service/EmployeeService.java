package com.iel.endoscope.service;

import com.iel.endoscope.entity.Employee;

import java.util.List;

/**
 * 员工的接口类
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public interface EmployeeService {

    /**
     * 通过主键删除对应的员工信息
     * @param employeeId
     * @return
     */
    int deleteByPrimaryKey(Long employeeId);

    /**
     * 插入员工信息
     * @param record
     */
    void insert(Employee record);

    /**
     * 选择性插入员工信息
     * @param record
     */
    void insertSelective(Employee record);

    /**
     * 批量添加员工
     * @param records
     */
    void insertBatch(List<Employee> records);

    /**
     * 通过employeeId查找对应的员工信息
     * @param employeeId
     * @return
     */
    Employee selectByPrimaryKey(Long employeeId);

    /**
     * 选择性更新员工信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * 更新员工信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Employee record);

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> findAllEmployees();
}
