package com.nowcoder.blog_back.dao;

import com.nowcoder.blog_back.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {

    User findByName(String Name);

}
