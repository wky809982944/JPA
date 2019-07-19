package com.wangkaiyi.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "t_menus")
public class Menus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer menusid;
    @Column
    private String menusname;
    @Column
    private String menuesurl;
    @Column
    private Integer fatherid;
    @ManyToMany(mappedBy = "menus")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Roles> roles = new HashSet<>();
}
