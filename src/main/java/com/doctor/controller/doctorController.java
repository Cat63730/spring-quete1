package com.doctor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class doctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String william(){
        return "William Hartnell";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String david(){
        return "David Tennant";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie(){
        return "Jodie Whittaker";
    }
}
