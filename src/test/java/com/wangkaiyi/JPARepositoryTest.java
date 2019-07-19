/*
package com.wangkaiyi;

import com.wangkaiyi.dao.UsersDaoJpaRepository;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class JPARepositoryTest {
    @Autowired
    private UsersDaoJpaRepository usersDao;
    @Test
    public void test1(){
        List<UsersOneToOne> list = usersDao.findAll();
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
}
*/
