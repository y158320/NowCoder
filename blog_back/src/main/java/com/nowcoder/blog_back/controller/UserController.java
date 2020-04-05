package com.nowcoder.blog_back.controller;

import com.alibaba.fastjson.JSON;
import com.nowcoder.blog_back.dao.UserDao;
import com.nowcoder.blog_back.pojo.ReturnMsg;
import com.nowcoder.blog_back.pojo.User;
import com.nowcoder.blog_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    private ReturnMsg returnMsg=new ReturnMsg();

    @RequestMapping("/login")
    public String say(HttpServletRequest request)
    {
        String Name=request.getParameter("Name");
        String PassWord=request.getParameter("PassWord");
        if (null==userService.findByName(Name))
        {
            returnMsg.setCode("000001");
            returnMsg.setMsg("asdas");
            return JSON.toJSON(returnMsg).toString();
        }
        if (PassWord.equals(userService.findByName(Name).getPassword()))
        {
            returnMsg.setCode("000000");
            returnMsg.setMsg("asdas");
            return JSON.toJSON(returnMsg).toString();
        }
        returnMsg.setCode("000001");
        returnMsg.setMsg("asdas");
        return JSON.toJSON(returnMsg).toString();
    }

}
