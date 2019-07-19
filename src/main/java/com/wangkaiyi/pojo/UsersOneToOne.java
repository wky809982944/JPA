package com.wangkaiyi.pojo;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "t_user")
public class UsersOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    @Column
    private String username;
    @Column
    private Integer userage;
    @OneToOne(cascade = CascadeType.PERSIST)
//    维护一个外键
    @JoinColumn(name = "roles_id")
    private RolesOneToOne roles;
}
