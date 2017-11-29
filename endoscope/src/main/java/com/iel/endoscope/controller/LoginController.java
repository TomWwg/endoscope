package com.iel.endoscope.controller;

import com.iel.endoscope.constant.ResultCode;
import com.iel.endoscope.dto.ResultDto;
import com.iel.endoscope.dto.ResultDtoFactory;
import com.iel.endoscope.dto.UserDto;
import com.iel.endoscope.entity.User;
import com.iel.endoscope.service.IUserService;
import com.iel.endoscope.util.EncryptUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wwg on 2017/11/29.
 */
@Controller
@RequestMapping(value = "login")
@Api(value = "/login", tags = "Login接口")
public class LoginController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录验证", notes = "请求时用户名、密码不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto login(@RequestBody UserDto dto){
        User userRequest = UserDto.form(dto);
        if (userRequest == null){
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
        User user = userService.findByUsername(userRequest.getUsername());
        if (user == null){
            return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
        }
        String password = user.getPassword();
        if (!password.equals(EncryptUtil.getPWd(userRequest.getPassword()))){
            return ResultDtoFactory.toError(ResultCode.PASSWORD_INCORRECT);
        }
        return ResultDtoFactory.toSuccess(ResultCode.SUCCESS);
    }
}
