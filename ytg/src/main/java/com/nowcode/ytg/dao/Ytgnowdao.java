package com.nowcode.ytg.dao;

import com.nowcode.ytg.pojo.Ytgnow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Ytgnowdao extends JpaRepository<Ytgnow,String>, JpaSpecificationExecutor<Ytgnow> {
}
