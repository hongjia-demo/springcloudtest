package com.yun.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class ClineController {
    //http://localhost:8701/Hello/World?s=小沛
    @RequestMapping("/World")
    public String helloWorld(String s){
        System.out.println("传入的值为："+s);
        return "传入的值为："+s;
    }
}
