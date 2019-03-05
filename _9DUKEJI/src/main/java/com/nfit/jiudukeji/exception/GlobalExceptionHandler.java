/*
package com.nfit.jiudukeji.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component
@ControllerAdvice(basePackages = "com.nfit.jiudukeji.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> controllerException(Exception e){
        Map<String, Object> map = new HashMap<>();
        System.out.println("全局的异常捕获统计");
        e.printStackTrace();
        map.put("info",e.getMessage());
        return map;
    }
}
*/
