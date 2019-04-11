package com.baizhi.controller;

import com.baizhi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("select")
    /*@ResponseBody*/
    public String select(){
        return "index";
    }
}
