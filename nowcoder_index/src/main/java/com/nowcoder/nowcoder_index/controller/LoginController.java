package com.nowcoder.nowcoder_index.controller;

import com.alibaba.fastjson.JSON;
import com.nowcoder.nowcoder_index.pojo.ReturnMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/register")
    public String register()
    {
        return "/html/register.html";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request)
    {
        System.out.println(request);
        return "/html/login.html";
    }

    @RequestMapping("nccommon/login/do")
    public String loginCheck(HttpServletRequest request)
    {
        String email=request.getParameter("email");
        String cipherPwd=request.getParameter("cipherPwd");
        ReturnMsg returnMsg=new ReturnMsg();
        returnMsg.setCode("102");
        return JSON.toJSONString(returnMsg);
    }

}
