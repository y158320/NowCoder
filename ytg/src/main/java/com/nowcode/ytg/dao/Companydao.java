package com.nowcode.ytg.dao;

import com.nowcode.ytg.pojo.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface Companydao extends JpaRepository<Company,String>, JpaSpecificationExecutor<Company> {
}
