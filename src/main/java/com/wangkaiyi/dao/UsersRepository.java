package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;

public interface UsersRepository {
    public UsersOneToOne findUserById(Integer userid);
}
