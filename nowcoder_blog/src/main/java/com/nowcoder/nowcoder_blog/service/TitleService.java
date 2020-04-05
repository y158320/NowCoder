package com.nowcoder.nowcoder_blog.service;

import com.nowcoder.nowcoder_blog.dao.TitleDao;
import com.nowcoder.nowcoder_blog.pojo.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleDao titleDao;

    public List<Title> say()
    {
        return titleDao.findAll();
    }

}
