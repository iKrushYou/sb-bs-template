package com.example.webtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("")
    public String getIndex() {
        return "index";
    }
}
