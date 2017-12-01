package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.EmployeeDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Employee;
import com.iel.endoscope.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 员工的Controller
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加员工", notes = "hospitalId,stationId,employeeName,roleId,rfid不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody EmployeeDto dto){
        Employee employeeRequest = EmployeeDto.form(dto);
        if(employeeRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        employeeService.insertSelective(employeeRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByEmployeeId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的员工信息", notes = "employeeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByEmployeeId(@RequestBody EmployeeDto dto){
        Employee employeeRequest = EmployeeDto.form(dto);
        if(employeeRequest.getEmployeeId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = employeeService.deleteByPrimaryKey(employeeRequest.getEmployeeId());
        if(status != 0){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新员工信息", notes = "employeeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody EmployeeDto dto){
        Employee employeeRequest = EmployeeDto.form(dto);
        if(employeeRequest.getEmployeeId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = employeeService.updateByPrimaryKeySelective(employeeRequest);
        if(status != 0){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByEmployeeId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键查找对应的员工信息", notes = "employeeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByEmployeeId(@RequestBody EmployeeDto dto){
        Employee employeeRequest = EmployeeDto.form(dto);
        if(employeeRequest.getEmployeeId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Employee employee = employeeService.selectByPrimaryKey(employeeRequest.getEmployeeId());
        if(employee == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(employee);
    }
}
