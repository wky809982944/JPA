package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * JpaSpecificationExecutor不能单独使用，需要配合jpa中的其他接口一起使用
 */
public interface UsersDao extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users>{
}
