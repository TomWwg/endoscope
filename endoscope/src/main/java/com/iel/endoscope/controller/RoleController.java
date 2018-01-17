package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.dto.RoleDto;
import com.iel.endoscope.entity.Role;
import com.iel.endoscope.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色的Controller
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
@Controller
@RequestMapping("endoscope/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加角色", notes = "hospitalId,roleName不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody RoleDto dto){
        Role roleRequest = RoleDto.form(dto);
        if(roleRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        roleService.insertSelective(roleRequest);
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "deleteByRoleId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过主键删除对应的角色信息", notes = "roleId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto deleteByRoleId(@RequestBody RoleDto dto){
        Role roleRequest = RoleDto.form(dto);
        if(roleRequest.getRoleId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = roleService.deleteByPrimaryKey(roleRequest.getRoleId());
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "选择性更新角色信息", notes = "roleId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto update(@RequestBody RoleDto dto){
        Role roleRequest = RoleDto.form(dto);
        if(roleRequest.getRoleId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        int status = roleService.updateByPrimaryKeySelective(roleRequest);
        if(status != 1){
            return ResultDtoFactory.toUnknowError();
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "findByRoleId", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "通过roleId查找对应的角色信息", notes = "roleId不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findByRoleId(@RequestBody RoleDto dto){
        Role roleRequest = RoleDto.form(dto);
        if(roleRequest.getRoleId() == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        Role role = roleService.selectByPrimaryKey(roleRequest.getRoleId());
        if(role == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(role);
    }

    @RequestMapping(value = "findAllRoles", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询所有的角色信息", notes = "暂无", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findAllRoles(){
        List<Role> roles = roleService.findAllRoles();
        return ResultDtoFactory.toSuccess(roles);
    }
}
