package com.wangkaiyi.dao;

import com.wangkaiyi.pojo.UsersOneToOne;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UsersDaoRepository extends Repository<UsersOneToOne, Integer> {
    //      方法名称命名规则
    List<UsersOneToOne> findByUsernameIs(String s);

    List<UsersOneToOne> findByUsernameLike(String s);

    List<UsersOneToOne> findByUsernameAndUserageGreaterThanEqual(String name, Integer age);

    //    使用@Query 注解查询
    @Query(value = "from UsersOneToOne where username= ?1 ")
    List<UsersOneToOne> queryUserByNameUseJPQL(String name);
    @Query("from UsersOneToOne where username like ?1")
    List<UsersOneToOne> queryUsersByLikeNameUseJPQL(String name);
    @Query("from UsersOneToOne where  username = ?1 and userage >= ?2")
    List<UsersOneToOne> queryUsersByNameandAge(String name, Integer age);

    //    使用@Query注解查询SQL
    // nativeQuery:默认的是false，表示不开启sql查询表 是否对value中的语句做转义
    @Query(value = "select * from jpa.t_user where username = ?",nativeQuery = true)
    List<UsersOneToOne> queryUsersByNameUserSQL(String name);

    @Query("update UsersOneToOne set userage = ?1  where userid = ?2")
    @Modifying//当前的语句是一个更新语句
    void updateUsersAgeById(Integer age, Integer id);
}
