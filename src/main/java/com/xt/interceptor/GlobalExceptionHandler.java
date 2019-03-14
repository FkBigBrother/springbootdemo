package com.xt.interceptor;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：高欢
 * @date ：Created in 2019/3/13 18:50
 * @description：
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("code","500");
        stringObjectHashMap.put("msg","fuck you!出错了");
        return stringObjectHashMap;
    }
}
