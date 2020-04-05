package com.nowcoder.blog_back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping("11")
    public String sya1()
    {
        return "1";
    }

}
