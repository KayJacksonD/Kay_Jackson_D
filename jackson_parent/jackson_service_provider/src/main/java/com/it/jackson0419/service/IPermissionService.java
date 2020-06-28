package com.it.jackson0419.service;

import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.Role;
import com.it.jackson0419.vo.User;

import java.util.List;

public interface IPermissionService {

    ResultVO addRoles(Role role);

    ResultVO getAllRoles();


}
