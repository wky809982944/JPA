package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDaoJpaRepository extends JpaRepository<UsersOneToOne,Integer> {
}
