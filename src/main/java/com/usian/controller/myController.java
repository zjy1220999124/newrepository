package com.usian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
    public @ResponseBody String  test(){
        return "宋国豪+++";
    }
}
