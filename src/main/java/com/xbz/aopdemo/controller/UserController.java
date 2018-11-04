package com.xbz.aopdemo.controller;

import com.xbz.aopdemo.pojo.User;
import com.xbz.aopdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService = null;
    @RequestMapping("/get/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

}
