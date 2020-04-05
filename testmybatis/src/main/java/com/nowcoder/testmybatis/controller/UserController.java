package com.nowcoder.testmybatis.controller;


import com.nowcoder.testmybatis.entity.User;
import com.nowcoder.testmybatis.mapper.UserMapper;
import com.nowcoder.testmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        String user=userService.say(id);
        return user;
    }
}
