package com.iel.endoscope.service;

import com.iel.endoscope.dao.EmployeeDAO;
import com.iel.endoscope.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工接口的实现类
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public int deleteByPrimaryKey(Long employeeId) {
        employeeDAO.deleteByPrimaryKey(employeeId);
        return 1;
    }

    @Override
    public void insert(Employee record) {
        employeeDAO.insert(record);
    }

    @Override
    public void insertSelective(Employee record) {
        employeeDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Employee> records) {
        employeeDAO.insertBatch(records);
    }

    @Override
    public Employee selectByPrimaryKey(Long employeeId) {
        Employee employee = employeeDAO.selectByPrimaryKey(employeeId);
        return employee;
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        employeeDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        employeeDAO.updateByPrimaryKey(record);
        return 1;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }
}
