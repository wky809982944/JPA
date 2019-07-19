package com.wangkaiyi.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_menus")
@Data
public class Menus {
    private Integer menusid;
    private String menusname;
    private String menuesurl;
    private Integer father;
}
