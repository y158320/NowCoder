package com.nowcoder.testmybatis.mapper;


import com.nowcoder.testmybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);

}
