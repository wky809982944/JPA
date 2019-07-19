package com.wangkaiyi.com.dao;

import com.wangkaiyi.dao.RolesDao;
import com.wangkaiyi.pojo.Menus;
import com.wangkaiyi.pojo.Roles;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyTest {
    @Autowired
    private RolesDao rolesDao;

    @Test
    public void test1() {
//         创建角色对象
        Roles roles = new Roles();
        roles.setRolename("超级管理员");
//        创建菜单对象    xxx管理平台---->用户管理
        Menus menus = new Menus();
        menus.setMenusname("xxx管理平台");
        menus.setFatherid(-1);
        menus.setMenuesurl(null);
//        创建用户管理菜单
        Menus menus1 = new Menus();
        menus1.setMenusname("用户管理平台");
        menus1.setFatherid(1);
        menus1.setMenuesurl(null);
//        建立关系
        roles.getMenus().add(menus);
        roles.getMenus().add(menus1);
        menus.getRoles().add(roles);
        menus1.getRoles().add(roles);
//        保存数据
        rolesDao.save(roles);

    }

    /**
     * 查询Roles
     */
    @Test
    public void test2() {
        Roles roles = rolesDao.findById(3).get();
        System.out.println("roles = " + roles);
        Set<Menus> menus = roles.getMenus();
        for (Menus menu : menus) {
            System.out.println("menu = " + menu);
        }
    }
}
