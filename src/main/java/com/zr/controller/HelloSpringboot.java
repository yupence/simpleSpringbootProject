package com.zr.controller;

import com.zr.bean.User;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloSpringboot {
    @Autowired
    private UserService userSercive;

    @RequestMapping("s")
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("find")
    public String find(){
        List<User> all = userSercive.findAll();
        return all.toString();
    }


}