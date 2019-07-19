package com.wangkaiyi.dao;


import com.wangkaiyi.pojo.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaSpecificationExecutor不能单独使用，需要配合jpa中的其他接口一起使用
 */
public interface RolesDao extends JpaRepository<Roles,Integer>{
}
