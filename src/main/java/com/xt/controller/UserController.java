package com.xt.controller;

import com.xt.vo.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：高欢
 * @date ：Created in 2019/3/6 16:41
 * @description：
 */
@RestController
public class UserController {
    @Resource
    com.xt.vo.person person;
    @ResponseBody
    @RequestMapping("/testBoot")
    public String hello(){
        return person.toString();
    }
}
