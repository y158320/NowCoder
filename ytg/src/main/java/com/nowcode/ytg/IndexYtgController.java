package com.nowcode.ytg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexYtgController {

    @RequestMapping("/")
    public String say()
    {
        return "/ytg/ytgindex.html";
    }

}
