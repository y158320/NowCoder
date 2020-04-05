package com.nowcode.ytg;

import com.alibaba.fastjson.JSON;
import com.nowcode.ytg.dao.Companydao;
import com.nowcode.ytg.dao.Ytgnowdao;
import com.nowcode.ytg.pojo.Ytgnow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by on 2018/6/14.
 * 功能描述:
 */
@RestController
public class CustomerController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    Ytgnowdao ytgnowdao;
    @Autowired
    Companydao companydao;

    @RequestMapping(value = "getEureka")
    public String getCus() {
        String helloget = helloRemote.helloget();
        return helloget;
    }

    @RequestMapping("/test177")
    public String test()
    {
//        System.out.println(userdao.getOne("1").getUsername());
        System.out.println(companydao.getOne("1").getUsername());
        return "1";
    }

    @RequestMapping("/ytg/init")
    public String init() {
        String BeforeDesc;
        String NowDesc;
        String AfterDesc;
        Ytgnow ytgnow = ytgnowdao.findById("1").get();
        String Beforeid = ytgnow.getBeforeid();
        String Afterid = ytgnow.getAfterid();
        if ("".equals(Beforeid) || null == Beforeid) {
            BeforeDesc = "没有";
        } else {
            BeforeDesc = ytgnowdao.findById(Beforeid).get().getNowdesc();
        }
        if ("".equals(ytgnow.getNowdesc()) || null == ytgnow.getNowdesc()) {
            NowDesc = "没有";
        } else {
            NowDesc = ytgnow.getNowdesc();
        }
        if ("".equals(Afterid) || null == Afterid) {
            AfterDesc = "没有";
        } else {
            AfterDesc = ytgnowdao.findById(Afterid).get().getNowdesc();
        }
        return BeforeDesc + "," + NowDesc + "," + AfterDesc+","+Beforeid+","+"1"+","+Afterid;
    }

    @RequestMapping("/ytg/beforeId")
    public String BrforeId(HttpServletRequest request)
    {
        String NowId=request.getParameter("beforeId");
        Ytgnow ytgnow=ytgnowdao.findById(NowId).get();
        String BeforeDesc;
        String NowDesc;
        String AfterDesc;
        String Beforeid = ytgnow.getBeforeid();
        String Afterid = ytgnow.getAfterid();
        if ("".equals(Beforeid) || null == Beforeid) {
            BeforeDesc = "没有";
            Beforeid = "0";
        } else {
            BeforeDesc = ytgnowdao.findById(Beforeid).get().getNowdesc();
        }
        if ("".equals(ytgnow.getNowdesc()) || null == ytgnow.getNowdesc()) {
            NowDesc = "没有";
        } else {
            NowDesc = ytgnow.getNowdesc();
        }
        if ("".equals(Afterid) || null == Afterid) {
            AfterDesc = "没有";
            Afterid="0";
        } else {
            AfterDesc = ytgnowdao.findById(Afterid).get().getNowdesc();
        }
        Map<String,String> map=new HashMap<>();
        map.put("NowId",NowId);
        map.put("NowDesc",NowDesc);
        map.put("BeforeDesc",BeforeDesc);
        map.put("BeforeId",Beforeid);
        map.put("AfterDesc",AfterDesc);
        map.put("AfterId",Afterid);
        String json = JSON.toJSONString(map);
        return json;
    }

    @RequestMapping("/ytg/afterId")
    public String AfterId(HttpServletRequest request)
    {
        String NowId=request.getParameter("afterId");
        Ytgnow ytgnow=ytgnowdao.findById(NowId).get();
        String BeforeDesc;
        String NowDesc;
        String AfterDesc;
        String Beforeid = ytgnow.getBeforeid();
        String Afterid = ytgnow.getAfterid();
        if ("".equals(Beforeid) || null == Beforeid) {
            BeforeDesc = "没有";
            Beforeid = "0";
        } else {
            BeforeDesc = ytgnowdao.findById(Beforeid).get().getNowdesc();
        }
        if ("".equals(ytgnow.getNowdesc()) || null == ytgnow.getNowdesc()) {
            NowDesc = "没有";
        } else {
            NowDesc = ytgnow.getNowdesc();
        }
        if ("".equals(Afterid) || null == Afterid) {
            AfterDesc = "没有";
            Afterid="0";
        } else {
            AfterDesc = ytgnowdao.findById(Afterid).get().getNowdesc();
        }
        Map<String,String> map=new HashMap<>();
        map.put("NowId",NowId);
        map.put("NowDesc",NowDesc);
        map.put("BeforeDesc",BeforeDesc);
        map.put("BeforeId",Beforeid);
        map.put("AfterDesc",AfterDesc);
        map.put("AfterId",Afterid);
        String json = JSON.toJSONString(map);
        return json;
    }

    @RequestMapping("/ytg/add")
    public String add(HttpServletRequest request){
        String NowDesc=request.getParameter("NowDesc");
        UUID uuid=UUID.randomUUID();
        String NowId=uuid.toString();
        NowId=NowId.replace("-","");
        Ytgnow ytgnow=new Ytgnow();
        ytgnow.setNowdesc(NowDesc);
        ytgnow.setNowid(NowId);
        try{
        ytgnow=ytgnowdao.save(ytgnow);
        }
        catch (Exception e)
        {
            return "由于某些错误，没有存储上";
        }
        return ytgnow.getNowdesc()+",添加成功";
    }

}
