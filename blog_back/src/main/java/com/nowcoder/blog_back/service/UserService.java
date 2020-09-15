package com.nowcoder.blog_back.service;

import com.nowcoder.blog_back.dao.UserDao;
import com.nowcoder.blog_back.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User   findByName(String Name)
    {
        return userDao.findByName(Name);
    }

}
