package com.my.individual.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("hello")
    @ResponseBody
    public String m01(){
        System.out.println("메서드 호출됨");
        return "test";
    }
}
