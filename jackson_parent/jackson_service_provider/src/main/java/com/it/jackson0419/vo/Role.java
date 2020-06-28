package com.it.jackson0419.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.*;

/**
 * 角色
 */
@Data
public class Role extends BaseVO implements Serializable {
    private Integer id;
    private Integer roleCode;
    private String name; // 角色名称
    private List<String> names; // 角色名称集合
    private List<Role> roleList = new ArrayList<>(); // 角色对象集合
    private String keyword; // 角色关键字，用于权限控制
    private String description; // 描述
    private Date effectiveTime; // 有效时间
    private Long roleGiveUserId; // 角色赋予人
    private Long roleGivenUserId; // 角色被赋予人
    private String menuCode;
    private Set<User> users = new HashSet<User>(0);
    private Set<Permission> permissions = new HashSet<Permission>(0);
    private LinkedHashSet<Menu> menus = new LinkedHashSet<Menu>(0);
}
