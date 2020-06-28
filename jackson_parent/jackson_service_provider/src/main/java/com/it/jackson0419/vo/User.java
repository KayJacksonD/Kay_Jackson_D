package com.it.jackson0419.vo;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
//@Table(name = "test2")
public class User extends BaseVO {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")*/
    private int id;
    private Long userId;

    //    @Column(name = "name")
    private String name;
    private String cnName;
    private String enName;
    private String password;
    private String userAccount;
    private String icon;//头像

    //    @Column(name = "age")
    private int age;
    private int roleCode;
    private List<Role> roles;
    private List<User> userList = new ArrayList<>();
}
