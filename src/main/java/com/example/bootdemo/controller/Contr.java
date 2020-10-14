package com.example.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc:
 * @author: lianglin
 * @date: 2020/10/12
 */
@Controller
public class Contr {
    @RequestMapping("/test")
    public String get(){
        System.out.println("test");
        return "success";
    }
}
