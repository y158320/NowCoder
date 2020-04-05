package com.nowcoder.nowcoder_blog.dao;

import com.nowcoder.nowcoder_blog.pojo.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TitleDao extends JpaRepository<Title,String>, JpaSpecificationExecutor<Title> {
}
