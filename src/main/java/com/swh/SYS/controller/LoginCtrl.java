package com.swh.SYS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtrl {

    @RequestMapping("login")
    public String test(){
        return "login/login";
    }

//    @RequestMapping("resource")
//    public String resources(){
//        return "resource";
//    }
}
