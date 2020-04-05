package com.nowcoder.nowcoder_blog.dao;

import com.nowcoder.nowcoder_blog.pojo.UpdateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UpdateLogDao extends JpaRepository<UpdateLog,String>, JpaSpecificationExecutor<UpdateLog> {
}
