package com.nowcoder.test.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//使用该注解支持跨域
@CrossOrigin
public class HelloWorldController {
    @RequestMapping(value = "/helloget")
    @ResponseBody
    public String helloget() {
        String s="测试服务之间调用";
        return s ;
    }
}
