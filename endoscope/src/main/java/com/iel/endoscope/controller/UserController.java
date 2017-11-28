package com.iel.endoscope.controller;

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
 * Created by wwg on 2017/11/13.
 * @author wwg
 */
@Controller
@RequestMapping("user")
@Api(value = "/user", tags = "User接口")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "插入用户信息", notes = "插入时医院Id、用户名、密码不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto add(@RequestBody UserDto dto){
        User user = UserDto.form(dto);
        if(user != null) {
            user.setPassword(EncryptUtil.getPWd(user.getPassword()));
            userService.insertSelective(user);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toUnknowError();
        }
    }

    @RequestMapping(value = "findById", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据Id查询用户信息", notes = "查询时Id不能为空", httpMethod = "POST", response = ResultDto.class)
    public ResultDto findById(@RequestBody UserDto dto){
        User userRequest = UserDto.form(dto);
        if(userRequest != null) {
            User user = userService.selectByPrimaryKey(userRequest.getUserId());
            return ResultDtoFactory.toSuccess(user);
        } else {
            return ResultDtoFactory.toUnknowError();
        }
    }
}
