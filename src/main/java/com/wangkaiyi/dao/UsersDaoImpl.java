package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsersDaoImpl implements UsersRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public UsersOneToOne findUserById(Integer userid) {
        return em.find(UsersOneToOne.class, userid);
    }
}
