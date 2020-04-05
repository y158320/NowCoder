package com.nowcoder.nowcoder_index.controller;

import com.alibaba.fastjson.JSON;
import com.nowcoder.nowcoder_index.pojo.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

//    @RequestMapping("/test7")
//    public String say()
//    {
//        Test test=new Test();
//        String a=JSON.toJSONString(test);
//        return a;
//    }

    @RequestMapping("/")
    public String say1()
    {
        return "index.html";
    }

//    @RequestMapping("/home")
//    public String say()
//    {
//        return "index.html";
//    }

}
