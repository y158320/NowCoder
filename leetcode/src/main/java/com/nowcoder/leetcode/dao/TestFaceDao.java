package com.nowcoder.leetcode.dao;

import com.nowcoder.leetcode.pojo.TestFace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestFaceDao extends JpaRepository<TestFace,String>, JpaSpecificationExecutor<TestFace> {
}
