package com.swh.SYS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCtrl {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
