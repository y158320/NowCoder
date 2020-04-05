package com.nowcoder.nowcoder_blog.controller;

import com.alibaba.fastjson.JSON;
import com.nowcoder.nowcoder_blog.pojo.ReturnMsg;
import com.nowcoder.nowcoder_blog.pojo.UpdateLog;
import com.nowcoder.nowcoder_blog.service.UpdateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UpdateLogController {

    @Autowired
    private UpdateLogService updateLogService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    private ReturnMsg returnMsg=new ReturnMsg();

    @RequestMapping("/api/updatelog")
    public String findAll()
    {
        return JSON.toJSONString(updateLogService.findAll());
    }

    @RequestMapping("/112177")
    public String test1()
    {
        return redisTemplate.opsForValue().get("Update:Log:Id");
    }

    @RequestMapping("/api/submitupdatelog")
    public String saveLog(HttpServletRequest request)
    {
        String LogDesc=request.getParameter("LogDesc");
        String LogData=request.getParameter("LogData");
        String LogTime=request.getParameter("LogTime");
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        String Id=redisTemplate.opsForValue().get("Update:Log:Id");
        Id=Integer.toString(Integer.parseInt(Id)+1);
        UpdateLog updateLog=new UpdateLog();
        updateLog.setId(Id);
        updateLog.setLogdesc(LogDesc);
        updateLog.setMakedate(LogData);
        updateLog.setMaketime(LogTime);
        updateLogService.saveLog(updateLog);
        redisTemplate.opsForValue().set("Update:Log:Id",Id);
        returnMsg.setCode("000000");
        returnMsg.setMsg("正常");
        return JSON.toJSONString(returnMsg);
    }

}
