package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.HospitalDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Hospital;
import com.iel.endoscope.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 医院Controller
 * Created by wwg on 2017/11/29.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/hospital")
@Api(value = "hospital", tags = "hospital接口")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "插入医院信息", notes = "医院名称不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody HospitalDto dto){
        Hospital hospitalRequest = HospitalDto.form(dto);
        if(hospitalRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        hospitalService.insertSelective(hospitalRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByHospitalId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据hospitalId查询医院信息", notes = "hospitalId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByHospitalId(@RequestBody HospitalDto dto){
        Hospital hospitalRequest = HospitalDto.form(dto);
        if(hospitalRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Hospital hospital = hospitalService.selectByPrimaryKey(hospitalRequest.getHospitalId());
        return ResultDtoFactory.toSuccess(hospital);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据UserId选择性更新用户信息", notes = "hospitalId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody HospitalDto dto){
        Hospital hospitalRequest = HospitalDto.form(dto);
        if(hospitalRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = hospitalService.updateByPrimaryKeySelective(hospitalRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByHospitalId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据HospitalId删除医院信息", notes = "hospitalId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByHospitalId(@RequestBody HospitalDto dto){
        Hospital hospitalRequest = HospitalDto.form(dto);
        if(hospitalRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = hospitalService.deleteByPrimaryKey(hospitalRequest.getHospitalId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }
}
