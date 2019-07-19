/*
package com.wangkaiyi;

import com.wangkaiyi.dao.UsersDao;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class JpaSpecificationExecutorTest {
    @Autowired
    private UsersDao usersDao;
    @Test
    public void test1(){
        Specification<UsersOneToOne> spec = new Specification<UsersOneToOne>() {
            */
/**
             * @param root            根对象 封装了查询条件的对象
             * @param criteriaQuery   定义了一个基本的查询，一般不使用
             * @param criteriaBuilder 创建一个查询条件
             * @return 定义的查询条件
             *//*

            @Override
            public Predicate toPredicate(Root<UsersOneToOne> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("username"), "王五");
            }
        };
        List<UsersOneToOne> list = usersDao.findAll(spec);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
    */
/**
     * 多条件查询方式一
     * 需求：使用用户姓名以及年龄查询数据
     *//*

    @Test
    public void test2(){
        Specification<UsersOneToOne> spec = new Specification<UsersOneToOne>() {
            @Override
            public Predicate toPredicate(Root<UsersOneToOne> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                list.add(criteriaBuilder.equal(root.get("username"), "王五"));
                list.add(criteriaBuilder.equal(root.get("userage"), 30));
//              此时条件之间是没有任何关系的
                Predicate[] arr = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(arr));
            }
        };
        List<UsersOneToOne> list = usersDao.findAll(spec);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
    */
/**
     * 多条件查询方式二
     * 需求：使用用户姓名以及年龄查询数据
     *//*

    @Test
    public void test3(){
        Specification<UsersOneToOne> spec = new Specification<UsersOneToOne>() {
            @Override
            public Predicate toPredicate(Root<UsersOneToOne> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.or(criteriaBuilder.equal(root.get("username"), "王五"), criteriaBuilder.equal(root.get("userage"), 25));
            }
        };
        List<UsersOneToOne> list = usersDao.findAll(spec);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }
    */
/**
     * 需求：查询王姓用户，并且做分页处理
     *//*

    @Test
    public void test4(){
//        条件
        Specification<UsersOneToOne> spec = new Specification<UsersOneToOne>() {
            @Override
            public Predicate toPredicate(Root<UsersOneToOne> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("username"), "王%");
            }
        };
//        分页
        Page<UsersOneToOne> page = usersDao.findAll(spec, PageRequest.of(0, 2));
        System.out.println("总条数：" + page.getTotalElements());
        System.out.println("总页数：" + page.getTotalPages());
        List<UsersOneToOne> list = page.getContent();
        for (UsersOneToOne users : page) {
            System.out.println("users = " + users);
        }
    }
    */
/**
     * 需求：查询数据库中王姓的用户，并且根据用户id做倒叙排序
     *//*

    @Test
    public void test5(){
        //        条件
        Specification<UsersOneToOne> spec = new Specification<UsersOneToOne>() {
            @Override
            public Predicate toPredicate(Root<UsersOneToOne> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("username"), "王%");
            }
        };
//        排序
        Sort sort = new Sort(Sort.Direction.DESC, "userid");
        List<UsersOneToOne> list = usersDao.findAll(spec, sort);
        for (UsersOneToOne users : list) {
            System.out.println("users = " + users);
        }
    }

    @Test
    public void test6() {
        UsersOneToOne user = usersDao.findUserById(4);
        System.out.println("user = " + user);
    }

}
*/
