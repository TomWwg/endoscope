package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.PatientDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Patient;
import com.iel.endoscope.service.PatientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 病人Controller
 * Created by wwg on 2017/12/4.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加病人信息", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody PatientDto dto){
        Patient patientRequest = PatientDto.form(dto);
        if(patientRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        patientService.insertSelective(patientRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByPatientId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据patientId删除对应的病人信息", notes = "patientId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByPatientId(@RequestBody PatientDto dto){
        Patient patientRequest = PatientDto.form(dto);
        if(patientRequest.getPatientId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = patientService.deleteByPrimaryKey(patientRequest.getPatientId());
        if (status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新病人信息", notes = "patientId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody PatientDto dto){
        Patient patientRequest = PatientDto.form(dto);
        if(patientRequest.getPatientId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = patientService.updateByPrimaryKeySelective(patientRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByPatientId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过patiendId查找对应的病人信息", notes = "patientId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByPatientId(@RequestBody PatientDto dto){
        Patient patientRequest = PatientDto.form(dto);
        if(patientRequest.getPatientId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Patient patient = patientService.selectByPrimaryKey(patientRequest.getPatientId());
        if(patient == null){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(patient);
    }
}
