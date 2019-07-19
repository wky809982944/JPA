package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;
import org.springframework.data.repository.CrudRepository;

public interface UsersDaoCRUDRepository extends CrudRepository<UsersOneToOne, Integer> {

}
