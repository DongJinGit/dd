package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    UserLogin userLogin;

    @RequestMapping(value = "/signIn", method = {RequestMethod.GET})
    public String signIn(User user, Model model){
        userLogin.signIn(user);
        //model.addAttribute("user",user);
        return "/select";
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = {RequestMethod.GET})
    public List<User> getAllUser(){
        List<User> Users=userLogin.getAllUser();
        //model.addAttribute("user",user);
        return Users;
    }

}
