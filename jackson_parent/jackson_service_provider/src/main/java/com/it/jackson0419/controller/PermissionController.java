package com.it.jackson0419.controller;

import com.it.jackson0419.service.IPermissionService;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/permissionController")
public class PermissionController {
    @Autowired
    IPermissionService permissionService;

    /**
     * 角色权限
     * http://localhost:18081/test
     */
    @PostMapping(value = "/addRoles")
    public ResultVO addRoles(@RequestBody Role role) {
        return permissionService.addRoles(role);
    }

    /**
     * 获取所有角色
     * http://localhost:18081/test
     */
    @GetMapping(value = "/getAllRoles")
    public ResultVO getAllRoles() {
        return permissionService.getAllRoles();
    }
}
