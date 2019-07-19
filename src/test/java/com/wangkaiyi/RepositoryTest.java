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

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class RepositoryTest {
    @Autowired
    private UsersDaoRepository usersDao;
    */
/**
     * 需求：使用用户名作为查询条件
     *//*

    @Test
    public void test1(){
        */
/**
         * 判断相等的条件有三种表示方式
         * 1.什么都不写，默认的就是做相等判断
         * 2.IS
         * 3.Equal
         *//*

        List<UsersOneToOne> list = usersDao.findByUsernameIs("张三");
        for (UsersOneToOne users : list) {
            log.info(users);
        }

    }
    */
/**
     * 需求：根据用户姓名做like处理
     * Like:条件关键字
     *//*

    @Test
    public void test2(){
        List<UsersOneToOne> list = usersDao.findByUsernameLike("张%");
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }
    */
/**
     * 需求：查询名称为王五，并且他的年龄大于等于22岁
     *//*

    @Test
    public void test3(){
        List<UsersOneToOne> list = usersDao.findByUsernameAndUserageGreaterThanEqual("王五", 22);
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }
    */
/**
     * 测试@Query
     *//*

    @Test
    public void test4(){
        List<UsersOneToOne> list = this.usersDao.queryUserByNameUseJPQL("王五");
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }

    @Test
    public void test5(){
        List<UsersOneToOne> list = this.usersDao.queryUsersByLikeNameUseJPQL("王%");
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }

    @Test
    public void test6(){
        List<UsersOneToOne> list = this.usersDao.queryUsersByNameandAge("王五", 30);
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }
    @Test
    public void test7(){
        List<UsersOneToOne> list = this.usersDao.queryUsersByNameUserSQL("王五");
        for (UsersOneToOne users : list) {
            log.info(users);
        }
    }

    */
/**
     * 测试@Query update
     *//*

    @Test
    @Transactional
    @Rollback(false)
    public void test10(){
       usersDao.updateUsersAgeById(24, 2);
    }
}
*/
