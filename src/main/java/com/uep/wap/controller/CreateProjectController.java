package com.uep.wap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateProjectController {

    @GetMapping(path = "/create-project")
    public String createProject(){
        return "cr_proj";
    }
}
