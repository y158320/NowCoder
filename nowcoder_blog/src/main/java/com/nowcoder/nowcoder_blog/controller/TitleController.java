package com.nowcoder.nowcoder_blog.controller;

import com.alibaba.fastjson.JSON;
import com.nowcoder.nowcoder_blog.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    @Autowired
    private TitleService titleService=new TitleService();

    @RequestMapping("/api/11217")
    public String title()
    {
        String json = JSON.toJSONString(titleService.say());
        return json;
    }
}
