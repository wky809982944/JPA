package com.wangkaiyi.pojo;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "t_user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    @Column
    private String username;
    @Column
    private Integer userage;
}
