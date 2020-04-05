package com.nowcoder.nowcoder_blog.service;

import com.nowcoder.nowcoder_blog.pojo.User;

public interface UserService {

    User save(User user);

    void delete(int id);

    User get(Integer id);
}
