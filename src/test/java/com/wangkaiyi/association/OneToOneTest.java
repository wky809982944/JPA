/*
package com.wangkaiyi.association;

import com.wangkaiyi.dao.UsersDao;
import com.wangkaiyi.pojo.RolesOneToOne;
import com.wangkaiyi.pojo.UsersOneToOne;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class OneToOneTest {
    @Autowired
    private UsersDao usersDao;

    */
/**
     * 添加用户同时添加角色
     *//*

    @Test
    public void test1() {
//         创建角色
        RolesOneToOne roles = new RolesOneToOne();
        roles.setRolename("管理员");
//        创建用户
        UsersOneToOne users = new UsersOneToOne();
        users.setUserage(30);
        users.setUsername("赵小刚");
//        建立关系
        users.setRoles(roles);
        roles.setUsers(users);
//        保存数据
        usersDao.save(users);
    }
    */
/**
     * 根据用户ID查询用户，同时查询用户角色
     *//*

    @Test
    public void test2(){
        UsersOneToOne users = usersDao.findById(3).get();
        System.out.println("users = " + users);
        RolesOneToOne roles = users.getRoles();

    }
}
*/
