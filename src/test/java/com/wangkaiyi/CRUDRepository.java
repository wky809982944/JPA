/*
package com.wangkaiyi;

import com.wangkaiyi.dao.UsersDaoCRUDRepository;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class CRUDRepository {
    @Autowired
    private UsersDaoCRUDRepository usersDao;

    @Test
    public void test1() {
        UsersOneToOne users = new UsersOneToOne();
        users.setUserage(21);
        users.setUsername("赵小丽");
        usersDao.save(users);
    }
    @Test
    public void test2() {
        UsersOneToOne users1 = new UsersOneToOne();
        users1.setUserage(21);
        users1.setUsername("李明博");
        UsersOneToOne users2 = new UsersOneToOne();
        users2.setUserage(23);
        users2.setUsername("王小虎");
        List<UsersOneToOne> list = new ArrayList<>();
        list.add(users1);
        list.add(users2);
        usersDao.saveAll(list);
    }
    */
/**
     * 根据ID查询单条数据
     *//*

    @Test
    public void test3() {
        UsersOneToOne users = usersDao.findById(5).get();
        log.info(users);
    }
    */
/**
     * 查询全部数据
     *//*

    @Test
    public void test4(){
        List<UsersOneToOne> list = (List<UsersOneToOne>) usersDao.findAll();
        for (UsersOneToOne users : list) {
            log.info(users);
        }

    }
    */
/**
     * 删除数据
     *//*

    @Test
    public void test5(){
         usersDao.deleteById(5);
    }
    */
/**
     * 更新数据
     *//*

    @Test
    @Transactional
    @Rollback(false)
    public void test6(){
        UsersOneToOne users = usersDao.findById(4).get();//持久化状态
        users.setUsername("王小绿");
    }
}
*/
