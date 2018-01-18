package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.EndoscopeDto;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.entity.Endoscope;
import com.iel.endoscope.service.EndoscopeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 内镜Controller
 * Created by wwg on 2017/11/1.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/endoscope")
public class EndoscopeController {

    @Autowired
    private EndoscopeService endoscopeService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性添加内镜信息", notes = "endoscopeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody EndoscopeDto dto){
        Endoscope endoscopeRequest = EndoscopeDto.form(dto);
        if(endoscopeRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        endoscopeService.insertSelective(endoscopeRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByEndoscopeId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的内镜信息", notes = "endoscopeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByEndoscopeId(@RequestBody EndoscopeDto dto){
        Endoscope endoscopeRequest = EndoscopeDto.form(dto);
        if(endoscopeRequest.getEndoscopeId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = endoscopeService.deleteByPrimaryKey(endoscopeRequest.getEndoscopeId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新内镜信息", notes = "endoscopeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody EndoscopeDto dto){
        Endoscope endoscopeRequest = EndoscopeDto.form(dto);
        if(endoscopeRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = endoscopeService.updateByPrimaryKeySelective(endoscopeRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByEndoscopeId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过endoscopeId查找对应的内镜信息", notes = "endoscopeId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByEndoscopeId(@RequestBody EndoscopeDto dto){
        Endoscope endoscopeRequest = EndoscopeDto.form(dto);
        if(endoscopeRequest.getEndoscopeId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Endoscope endoscope = endoscopeService.selectByPrimaryKey(endoscopeRequest.getEndoscopeId());
        if(endoscope == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(endoscope);
    }

    @RequestMapping(value = "findByEndoscopeType", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过内镜类型查找对应的内镜信息", notes = "endoscopeType可传可不传", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByEndoscopeType(@RequestBody EndoscopeDto dto){
        Endoscope endoscopeRequest = EndoscopeDto.form(dto);
        if(endoscopeRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        List<Endoscope> endoscopeList = endoscopeService.findByEndoscopeType(endoscopeRequest);
        return ResultDtoFactory.toSuccess(endoscopeList);
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询所有内镜信息", notes = "暂无", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findAll(){
        List<Endoscope> endoscopes = endoscopeService.findAll();
        return ResultDtoFactory.toSuccess(endoscopes);
    }

}
