package com.nowcoder.blog_back.dao;

import com.nowcoder.blog_back.pojo.UpdateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UpdateLogDao extends JpaRepository<UpdateLog,String>, JpaSpecificationExecutor<UpdateLog> {
}
