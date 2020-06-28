package com.it.jackson0419.controller;

import com.it.jackson0419.service.IPermissionService;
import com.it.jackson0419.service.IUserService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.Role;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/userController")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * 根据userId查询用户
     * http://localhost:18081/test
     */
    @GetMapping(value = "/getUserByUserId")
    public ResultVO getUserByUserId(@RequestParam Long userId) {
        User userVO = userService.getUserByUserId(userId);
        return ResultUtil.returnResult(userVO);
    }

    /**
     * 根据用户账号查询user集合
     * http://localhost:18081/test
     */
    @GetMapping(value = "/getAllUser")
    public ResultVO getAllUser() {
        return userService.getAllUser();
    }
}
