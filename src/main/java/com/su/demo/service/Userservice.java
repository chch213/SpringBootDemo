package com.su.demo.service;

import com.su.demo.mapper.UserMapper;
import com.su.demo.model.User;
import com.su.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice implements UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(User user) {
    int result=   userMapper.insert(user);
        if(result>=1){

            return "保存成功";
        }else{
            return "失败";
        }
    }
}
