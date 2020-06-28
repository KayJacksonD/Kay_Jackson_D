package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.IPermissionDao;
import com.it.jackson0419.dao.IUserDao;
import com.it.jackson0419.service.IPermissionService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.Role;
import com.it.jackson0419.vo.TipVO;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService implements IPermissionService {
    @Autowired(required = false)
    IPermissionDao permissionDao;

    @Autowired(required = false)
    IUserDao userDao;

    @Override
    public ResultVO addRoles(Role role) {
        //判断被赋予角色的用户是否存在
        User user = userDao.getUserByUserId(role.getRoleGivenUserId());
        if (user == null) {
            return ResultUtil.returnResult(TipVO.SUCCESS, TipVO.USER_NO_EXIT);
        }
        //已存在，给指定用户赋予角色
        permissionDao.addRoles(role);
        return ResultUtil.returnResult();
    }

    @Override
    public ResultVO getAllRoles() {
        Role role = new Role();
        role.setRoleList(permissionDao.getAllRoles());
        return ResultUtil.returnResult(role);
    }
}
