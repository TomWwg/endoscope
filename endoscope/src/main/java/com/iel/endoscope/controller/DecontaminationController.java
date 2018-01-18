package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.*;
import com.iel.endoscope.entity.Decontamination;
import com.iel.endoscope.entity.DecontaminationRealTime;
import com.iel.endoscope.entity.DecontaminationWork;
import com.iel.endoscope.service.DecontaminationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 洗消日志Controller
 * Created by wwg on 2017/12/5.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/decontamination")
public class DecontaminationController {

    @Autowired
    private DecontaminationService decontaminationService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加洗消日志信息", notes = "hospitalId,stationId,employeeId,endoscopeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody DecontaminationDto dto){
        Decontamination decontaminationRequest = DecontaminationDto.form(dto);
        if(decontaminationRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        decontaminationService.insertSelective(decontaminationRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByDecontaminationId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的洗消日志信息", notes = "decontaminationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByDecontaminationId(@RequestBody DecontaminationDto dto){
        Decontamination decontaminationRequest = DecontaminationDto.form(dto);
        if(decontaminationRequest.getDecontaminationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = decontaminationService.deleteByPrimaryKey(decontaminationRequest.getDecontaminationId());
        if (status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新洗消日志信息", notes = "decontaminationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody DecontaminationDto dto){
        Decontamination decontaminationRequest = DecontaminationDto.form(dto);
        if(decontaminationRequest.getDecontaminationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = decontaminationService.updateByPrimaryKeySelective(decontaminationRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByDecontaminationId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过decontaminationId查找对应的洗消日志信息", notes = "decontaminationId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByDecontaminationId(@RequestBody DecontaminationDto dto){
        Decontamination decontaminationRequest = DecontaminationDto.form(dto);
        if(decontaminationRequest.getDecontaminationId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Decontamination decontamination = decontaminationService.selectByPrimaryKey(decontaminationRequest.getDecontaminationId());
        if(decontamination == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(decontamination);
    }

    @RequestMapping(value = "findDecontaminationRealTime", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "手工洗消实时显示", notes = "无", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findDecontaminationRealTime(){
        List<DecontaminationRealTime> decontaminationRealTimes = decontaminationService.findDecontaminationRealTime();
        return ResultDtoFactory.toSuccess(decontaminationRealTimes);
    }

    @RequestMapping(value = "findWorkloadStatistics", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "工作量统计", notes = "通过工号/姓名/角色/起止时间查询对应的员工工作量统计信息", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findWorkloadStatistics(@RequestBody DecontaminationWorkDto dto){
        DecontaminationWork decontaminationWork = DecontaminationWorkDto.form(dto);
        if(decontaminationWork == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("employeeNumber", decontaminationWork.getEmployeeNumber());
        map.put("employeeName", decontaminationWork.getEmployeeName());
        map.put("roleId", decontaminationWork.getRoleId());
        map.put("startTime", dto.getStartTime());
        map.put("endTime", dto.getEndTime());
        List<DecontaminationWork> list = decontaminationService.findWorkloadStatistics(map);
        return ResultDtoFactory.toSuccess(list);
    }

    @RequestMapping(value = "findDecontaminationLog", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据内镜编号/内镜名称/内镜类型/洗消人员/审核结果/开始时间、结束时间查询对应的手工洗消日志信息", notes = "除开始时间、结束时间意外其他条件可以为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findDecontaminationLog(@RequestBody DecontaminationLogDto dto){
        Map<String, Object> map = DecontaminationLogDto.form(dto);
        if(map.get("startTime") == null || map.get("endTime") == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        
    }

}
