package com.project.findme.controller;


import com.project.findme.entity.User;
import com.project.findme.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/background")
public class UserController {

    private UserService userService;

    @RequestMapping("/index")
    public String toUser(){
        return "index";
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/signin")
    public String signin(){
        return "signin";
    }

    @RequestMapping("/login")
    public String userlogin(User loginuser, HttpServletRequest request, Model model){
        User user = userService.urlogin(loginuser);
        HttpSession session = request.getSession();
        if(user != null){
            session.setAttribute("user1",user);
            User loginuser1 = (User) session.getAttribute("user1");
            return "/index";
        }else{
            model.addAttribute("message","登录名与密码不符，请重新输入！");
            return "/login";
        }
    }
}
