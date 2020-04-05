package com.nowcoder.leetcode.controller;

import com.nowcoder.leetcode.dao.TestFaceDao;
import com.nowcoder.leetcode.pojo.TestFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
public class TestController {

    @Autowired
    TestFaceDao testFaceDao;

    @RequestMapping("/vue-element-admin/user/login")
    public String say1()
    {
        return "117";
    }

    @RequestMapping("/test/face")
    public String say(HttpServletRequest request)
    {
        String UserName= request.getParameter("UserName");
        TestFace testFace=new TestFace();
        UUID uuid=UUID.randomUUID();
        String id=uuid.toString();
        id=id.replace("-","");
        testFace.setId(id);
        testFace.setMakedate("2");
        testFace.setModifydate("3");
        testFace.setUsername(UserName);
        try {
            testFaceDao.save(testFace);
        }
        catch (Exception e)
        {
            return "Exception";
        }
        return "Success";
    }

}
