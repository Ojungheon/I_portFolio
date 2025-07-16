package com.my.individual.member.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    //회원가입 (화면)
    @GetMapping("join")
    public String join(HttpServletRequest req , HttpServletResponse resp){
        return "member/join";
    }
}
