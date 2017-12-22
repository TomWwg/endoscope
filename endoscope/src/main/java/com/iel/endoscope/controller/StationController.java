package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.dto.StationDto;
import com.iel.endoscope.entity.Station;
import com.iel.endoscope.service.StationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 工作站接口
 * Created by wwg on 2017/11/30.
 * wwg
 */
@Controller
@RequestMapping("endoscope/station")
public class StationController {

    @Autowired
    private StationService stationService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "新增工作站", notes = "stationId,hospitalId,stationName,rfid不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody StationDto dto){
        Station stationRequest = StationDto.form(dto);
        if(stationRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        stationService.insertSelective(stationRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByStationId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的工作站信息", notes = "stationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByStationId(@RequestBody StationDto dto){
        Station stationRequest = StationDto.form(dto);
        if(stationRequest.getStationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = stationService.deleteByPrimaryKey(stationRequest.getStationId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新工作站信息", notes = "stationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody StationDto dto){
        Station stationRequest = StationDto.form(dto);
        if(stationRequest.getStationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = stationService.updateByPrimaryKeySelective(stationRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByStationId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过stationId查找对应的工作站信息", notes = "stationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByStationId(@RequestBody StationDto dto){
        Station stationRequest = StationDto.form(dto);
        if(stationRequest.getStationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Station station = stationService.selectByPrimaryKey(stationRequest.getStationId());
        if(station == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(station);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询所有工作站", notes = "不需要传入参数", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findAll(){
        List<Station> stations = stationService.findAll();
        return ResultDtoFactory.toSuccess(stations);
    }

}
