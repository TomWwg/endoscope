package com.iel.endoscope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wwg on 2017/11/1.
 * @author wwg
 */
@Controller
@RequestMapping(value = "endoscope")
public class EndoscopeController {

    @ResponseBody
    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String test(){
        return "hello iel";
    }

}
