package com.wangkaiyi.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer roleid;
    @Column
    private String rolename;
    @OneToMany(mappedBy = "roles")
    @ToString.Exclude
    private Set<UsersOneToMany> users = new HashSet<>();

}
