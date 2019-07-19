package com.wangkaiyi.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_roles")
@Data
public class RolesOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer roleid;
    @Column
    private String rolename;
//    被哪个类关联，填写类里的属性
    @OneToOne(mappedBy = "roles")
    private UsersOneToOne users;
}
