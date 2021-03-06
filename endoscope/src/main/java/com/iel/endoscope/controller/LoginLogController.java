package com.iel.endoscope.controller;

import com.github.pagehelper.PageInfo;
import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.*;
import com.iel.endoscope.entity.LoginLog;
import com.iel.endoscope.entity.LoginLogReturn;
import com.iel.endoscope.service.LoginLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 登陆日志Controller
 * @author wwg
 * @date 2017/12/6
 */
@Controller
@RequestMapping("endoscope/loginLog")
@Api(value = "loginLog", tags = "loginLog接口")
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加登陆日志", notes = "无特殊要求", httpMethod = "POST", response =ResultDto.class)
    public ResultDto add(@RequestBody LoginLogDto dto){
        LoginLog loginLogRequest = LoginLogDto.form(dto);
        if(loginLogRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        loginLogService.insertSelective(loginLogRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByLoginLogId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的登陆日志信息", notes = "loginLogId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByLoginLogId(@RequestBody LoginLogDto dto){
        LoginLog loginLogRequest = LoginLogDto.form(dto);
        if(loginLogRequest.getLoginLogId() ==null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = loginLogService.deleteByPrimaryKey(loginLogRequest.getLoginLogId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "更新", notes = "loginLogId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody LoginLogDto dto){
        LoginLog loginLogRequest = LoginLogDto.form(dto);
        if(loginLogRequest.getLoginLogId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = loginLogService.updateByPrimaryKeySelective(loginLogRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByLoginLogId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键查询对应的登陆日志信息", notes = "loginLogId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByLoginLogId(@RequestBody LoginLogDto dto){
        LoginLog loginLogRequest = LoginLogDto.form(dto);
        if(loginLogRequest.getLoginLogId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        LoginLog loginLog = loginLogService.selectByPrimaryKey(loginLogRequest.getLoginLogId());
        if (loginLog == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(loginLog);
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
