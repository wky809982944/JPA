/*
package com.wangkaiyi.association;

import com.wangkaiyi.dao.UsersDao;
import com.wangkaiyi.pojo.RolesOneToMany;
import com.wangkaiyi.pojo.UsersOneToMany;
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
public class OneToOneMany {
    @Autowired
    private UsersDao usersDao;
    */
/**
     * 添加用户同时添加角色
     *//*

    @Test
    public void test1(){
//         创建角色
        RolesOneToMany roles = new RolesOneToMany();
        roles.setRolename("管理员4");
//         创建用户
        UsersOneToMany users = new UsersOneToMany();
        users.setUserage(30);
        users.setUsername("小红");
//        建立关系
        roles.getUsers().add(users);
        users.setRoles(roles);
//        保存角色
        usersDao.save(users);
    }
//    根据用户ID查询用户信息，同时查询角色
    @Test
    @Transactional
    @Rollback(false)
    public void test2(){
        UsersOneToMany users = usersDao.findById(7).get();
        System.out.println("用户姓名"+users.getUsername());
        RolesOneToMany roles = users.getRoles();
        System.out.println("roles = " + roles);
    }
}
*/
