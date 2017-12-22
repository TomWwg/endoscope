package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.ProcessDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Process;
import com.iel.endoscope.service.ProcessService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwg on 2017/12/22.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增流程", notes = "无特殊要求", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody ProcessDto dto){
        Process processRequest = ProcessDto.form(dto);
        if(processRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        processService.insertSelective(processRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByProcessId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的流程信息", notes = "processId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByProcessId(@RequestBody ProcessDto dto){
        Process processRequest = ProcessDto.form(dto);
        if(processRequest.getProcessId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status =  processService.deleteByPrimaryKey(processRequest.getProcessId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新流程信息", notes = "processId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody ProcessDto dto){
        Process processRequest = ProcessDto.form(dto);
        if(processRequest.getProcessId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = processService.updateByPrimaryKeySelective(processRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询所有的流程信息", notes = "无特殊要求", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findAll(){
        List<Process> processes = new ArrayList<>();
        processes = processService.findAll();
        return ResultDtoFactory.toSuccess(processes);
    }
}
