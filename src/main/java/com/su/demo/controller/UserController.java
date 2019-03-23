package com.su.demo.controller;

import com.su.demo.model.User;
import com.su.demo.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    //?name=张三&password=123&sex=男

    @RequestMapping("/insertUser")
    public String insertUser(User user){
//        User user=new User(name,password,sex);
     return userService.insert(user);
    }
}
