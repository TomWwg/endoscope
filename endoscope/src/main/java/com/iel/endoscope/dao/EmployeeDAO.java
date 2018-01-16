package com.iel.endoscope.dao;


import com.iel.endoscope.entity.Employee;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface EmployeeDAO {
    int deleteByPrimaryKey(Long employeeId);

    void insert(Employee record);

    void insertSelective(Employee record);

    void insertBatch(List<Employee> records);

    Employee selectByPrimaryKey(Long employeeId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> findAllEmployees();
}