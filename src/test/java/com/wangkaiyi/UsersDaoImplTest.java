/*
package com.wangkaiyi;

import com.wangkaiyi.dao.UsersDaoRepository;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class UsersDaoImplTest {
    @Autowired
    private UsersDaoRepository usersDao;
    */
/**
     * 添加用户
     *//*

    @Test
    @Transactional
    @Rollback(false)
    public void testInsertUsers(){
        UsersOneToOne users = new UsersOneToOne();
        users.setAge(24);
        users.setUsername("张三");
        usersDao.save(users);
    }
    @Test
    public void test(){
//        org.springframework.data.jpa.repository.support.SimpleJpaRepository@6658f08a
       log.info(usersDao);
//         class com.sun.proxy.$Proxy91代理对象，基于JDK的动态代理方式创建的
       log.info(this.usersDao.getClass());
    }
}
*/
