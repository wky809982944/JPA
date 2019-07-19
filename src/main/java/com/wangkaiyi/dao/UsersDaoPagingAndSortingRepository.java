package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersDaoPagingAndSortingRepository extends PagingAndSortingRepository<UsersOneToOne,Integer> {
}
