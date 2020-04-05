package com.nowcoder.blog_back.service;

import com.nowcoder.blog_back.dao.UpdateLogDao;
import com.nowcoder.blog_back.pojo.UpdateLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateLogService {

    @Autowired
    private UpdateLogDao updateLogDao;

    public List<UpdateLog> findAll()
    {
        return updateLogDao.findAll();
    }

    public boolean saveLog(UpdateLog updateLog)
    {
        try {
            updateLogDao.save(updateLog);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

}
