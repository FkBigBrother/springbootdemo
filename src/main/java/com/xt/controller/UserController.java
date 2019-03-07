package com.xt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：高欢
 * @date ：Created in 2019/3/6 16:41
 * @description：
 */
@RestController
public class UserController {
    @ResponseBody
    @RequestMapping("/testBoot")
    public String hello(){
        return "Hello World";
    }
}
