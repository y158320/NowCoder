package com.nowcoder.nowcoder_index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonateController {

    @RequestMapping("/donate")
    public String say()
    {
        System.out.println("145");
        String returnPath="success.html";
        return "redirect: ../"+returnPath;
    }

}
