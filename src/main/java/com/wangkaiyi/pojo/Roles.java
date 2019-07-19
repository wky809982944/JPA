package com.wangkaiyi.pojo;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "t_roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer roleid;
    @Column
    private String rolename;
    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
//    @JoinTable:配置中间表
//    joinColumns建立在当前表在中间表的外键字段
    @JoinTable(name = "t_roles_menus", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "menu_id"))
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Menus> menus = new HashSet<>();
}
