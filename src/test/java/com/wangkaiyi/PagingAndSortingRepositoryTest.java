/*
package com.wangkaiyi;

import com.wangkaiyi.dao.UsersDaoPagingAndSortingRepository;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class PagingAndSortingRepositoryTest {
    @Autowired
    private UsersDaoPagingAndSortingRepository usersDao;

    */
/**
     * 分页
     *//*

    @Test
    public void test1() {
//        当前页的索引，索引从0开始
        int page = 1;
//        每一页显示3条数据
        int size = 3;
        Page<UsersOneToOne> p = usersDao.findAll(PageRequest.of(page - 1, size));
        log.info("数据的总条数" + p.getTotalElements());
        log.info("总页数" + p.getTotalPages());
        List<UsersOneToOne> list = p.getContent();
        for (UsersOneToOne users : p) {
            log.info(users);
        }
    }
    */
/**
     * 对单列做排序处理
     *//*

    @Test
    public void test2(){
//        Sort:该对象封装了排序规则以及指定的排序字段（对象的属性来表示）
//        direction:排序规则
//        properties：指定做排序的属性
        Sort sort = new Sort(Sort.Direction.DESC, "userid");
        List<UsersOneToOne> list = (List<UsersOneToOne>) usersDao.findAll(sort);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
    */
/**
     * 多列的排序处理
     *//*

    @Test
    public void test3(){
//        Sort:该对象封装了排序规则以及指定的排序字段（对象的属性来表示）
//        direction:排序规则
//        properties：指定做排序的属性
        Sort.Order order1 = new Sort.Order(Sort.Direction.DESC, "userid");
        Sort.Order order2 = new Sort.Order(Sort.Direction.ASC, "username");
        Sort sort = new Sort(order1,order2);
        List<UsersOneToOne> list = (List<UsersOneToOne>) usersDao.findAll(sort);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
}
*/
