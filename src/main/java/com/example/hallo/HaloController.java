package com.example.hallo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloController {
    @RequestMapping(value="/")
    public String say(){
        return  "Halo Springboot!";
    }
}
