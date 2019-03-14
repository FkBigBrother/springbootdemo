package com.xt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @author ：高欢
 * @date ：Created in 2019/3/6 16:41
 * @description：
 */
@Controller//@RestController相当于Controller加上@ResponseBody
public class UserController {
    @Resource
    com.xt.vo.person person;

    @ResponseBody
    @RequestMapping("/testBoot")
    public String hello() {
        return person.toString();
    }

    @RequestMapping("/testModel")
    public String find(ModelMap map, HttpServletRequest request) {
        map.addAttribute("msg", "asduabsd");
        request.setAttribute("name","woshiniabba");
        map.addAttribute("sex",1);
        ArrayList<Object> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        map.addAttribute("list",list);
        return "success";
    }

}
