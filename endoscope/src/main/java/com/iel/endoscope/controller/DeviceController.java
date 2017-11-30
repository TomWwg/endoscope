package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.DeviceDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Device;
import com.iel.endoscope.service.DeviceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 设备Controller类
 * Created by wwg on 2017/11/30.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增设备信息", notes = "deviceId,hospitalId,stationId,deviceName不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody DeviceDto dto){
        Device deviceRequest = DeviceDto.form(dto);
        if(deviceRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        deviceService.insertSelective(deviceRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByDeviceId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过deviceId删除该设备信息", notes = "deviceId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByDeviceId(@RequestBody DeviceDto dto){
        Device deviceRequest = DeviceDto.form(dto);
        if(deviceRequest.getDeviceId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = deviceService.deleteByPrimaryKey(deviceRequest.getDeviceId());
        if(status != 0){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新设备信息", notes = "deviceId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody DeviceDto dto){
        Device deviceRequest = DeviceDto.form(dto);
        if(deviceRequest.getDeviceId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = deviceService.updateByPrimaryKeySelective(deviceRequest);
        if(status != 0){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByDeviceId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过DeviceId查找该设备信息", notes = "deviceId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByDeviceId(@RequestBody DeviceDto dto){
        Device deviceRequest = DeviceDto.form(dto);
        if(deviceRequest.getDeviceId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Device device = deviceService.selectByPrimaryKey(deviceRequest.getDeviceId());
        if(device == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(device);
    }
}
