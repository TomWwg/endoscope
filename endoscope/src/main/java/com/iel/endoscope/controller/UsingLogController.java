package com.iel.endoscope.controller;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.*;
import com.iel.endoscope.entity.LoginLogReturn;
import com.iel.endoscope.entity.UsingLog;
import com.iel.endoscope.entity.UsingLogReturn;
import com.iel.endoscope.service.LoginLogService;
import com.iel.endoscope.service.UsingLogService;
import com.iel.endoscope.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by wwg on 2018/1/4.
 */
@Controller
@RequestMapping("endoscope/usingLog")
@Api(value = "usingLog", tags = "UsingLog接口")
public class UsingLogController {

    @Autowired
    private UsingLogService usingLogService;

    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping(value = "findUsingPercent", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过内镜编号、内镜名称、内镜类型、起止时间查询该时间段内的内镜使用信息", notes = "startTime和endTime不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findUsingPercent(@RequestBody UsingLogReturnDto dto){
        UsingLogReturn usingLogReturnRequest = UsingLogReturnDto.form(dto);
        if(usingLogReturnRequest.getStartTime() == null || usingLogReturnRequest.getEndTime() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        List<UsingLogReturn> usingLogReturns = usingLogService.findByENumberAndENameAndETypeAndTime(usingLogReturnRequest);
        if(usingLogReturns == null || usingLogReturns.size() == 0){
            return ResultDtoFactory.toSuccess("根据条件查询无数据");
        }
        int total = usingLogService.findCountsUnderCertainTime(usingLogReturnRequest);
        Set<String> endoscopeNumbers = new HashSet<>();
        for (int i = 0; i < usingLogReturns.size(); i++){
            endoscopeNumbers.add(usingLogReturns.get(i).getEndoscopeNumber());
        }
        Map<String, Integer> usedNumbersMap = new HashMap<>();
        for (String str : endoscopeNumbers) {
            Integer usingNumber = 0;
            for (int i = 0; i < usingLogReturns.size(); i++){
                if(str.equals(usingLogReturns.get(i).getEndoscopeNumber())){
                    usingNumber++;
                }
            }
            usedNumbersMap.put(str, usingNumber);
        }
        Set<UsingLogReturn> list = new HashSet<>();
        list.addAll(usingLogReturns);
        for(String s : usedNumbersMap.keySet()){
            for(UsingLogReturn val : list){
                if(val.getEndoscopeNumber().equals(s)){
                    val.setUsedTimes(usedNumbersMap.get(s));
                    val.setUsedRate(new BigDecimal((float)usedNumbersMap.get(s)/total*100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() + "%");
                }
            }
        }
        return ResultDtoFactory.toSuccess(list);
    }

    @RequestMapping(value = "findByUsingLogId", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto findByUsingLogId(@RequestBody UsingLogReturnDto dto){
        Date date = new Date();
        UsingLog usingLog = usingLogService.selectByPrimaryKey(dto.getUsingLogId());
        return ResultDtoFactory.toSuccess(usingLog);
    }

    @RequestMapping(value = "findCountsUnderCertainTime", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询对应的时间段内的内镜使用次数", notes = "起始时间不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findCountsUnderCertainTime(@RequestBody UsingLogReturnDto dto){
        UsingLogReturn usingLogReturnRequest = UsingLogReturnDto.form(dto);
        if(usingLogReturnRequest.getStartTime() == null || usingLogReturnRequest.getEndTime() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int total = usingLogService.findCountsUnderCertainTime(usingLogReturnRequest);
        return ResultDtoFactory.toSuccess(total);
    }

    @RequestMapping(value = "findUsingLogByManyParameters", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "", notes = "", httpMethod = "", response = ResultDto.class)
    public ResultDto findUsingLogByManyParameters(@RequestBody UsingLogReturnDto dto){
        UsingLogReturn usingLogReturnRequest = UsingLogReturnDto.form(dto);
        Page page = UsingLogReturnDto.buildPage(dto.getPageNum(), dto.getPageSize());
        PageInfo pageInfo = usingLogService.findUsingLogByManyParameters(usingLogReturnRequest, page);
        return ResultDtoFactory.toSuccess(new PageRequest<>(pageInfo));
    }

    @RequestMapping(value = "findLoginLogReturn", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "登录日志查询接口", notes = "起始时间不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findLoginLogReturn(@RequestBody LoginLogReturnDto dto){
        if(dto.getStartTime() == null || dto.getEndTime() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        LoginLogReturn logReturn = LoginLogReturnDto.form(dto);
        Map<String, Object> map = new HashMap<>();
        map.put("startTime", dto.getStartTime());
        map.put("endTime", dto.getEndTime());
        if(logReturn.getLoginType() != null){
            map.put("loginType", logReturn.getLoginType());
        }
        if(logReturn.getUserName() != null){
            map.put("userName", logReturn.getUserName());
        }
        PageInfo<LoginLogReturn> pageInfo = loginLogService.findLoginLogReturn(map, dto.buildPage());
        return ResultDtoFactory.toSuccess(new PageRequest<>(pageInfo));
    }
}
