package com.nowcode.ytg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by *** on 2018/6/14.
 * 功能描述:
 */
@FeignClient(name= "ServiceHi")
public interface HelloRemote {
    @RequestMapping(value = "/helloget")
    public String helloget();
}