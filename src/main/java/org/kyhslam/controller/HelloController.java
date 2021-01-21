package org.kyhslam.controller;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Member;

@Controller
@Slf4j
public class HelloController {


    @GetMapping("/hello")
    public String hello(Model model) {
        String data = "kyhslam";
        model.addAttribute("data", data);
        //return "board/boardList";
        return "main";
    }


    @GetMapping("/hello/list")
    public String list(Model model) {
        return "/members/memberList";
    }

    @GetMapping("/hello/create")
    public String create(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return "/members/createMemberForm";
    }

    @GetMapping("/hello/jsptest")
    public String tt(Model model) {
        log.info("ttjspTest ======");
        return "main";
    }

    @GetMapping("/hello/issueList")
    public String issueList(Model model) {

        return "issueBoard";
    }



}
