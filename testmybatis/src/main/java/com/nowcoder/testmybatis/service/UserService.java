package com.nowcoder.testmybatis.service;

import com.nowcoder.testmybatis.entity.User;
import com.nowcoder.testmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public String say(int id)
    {
        User user=userMapper.Sel(id);
        return user.getUserName();
    }

}
