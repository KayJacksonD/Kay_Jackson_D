package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.IUserDao;
import com.it.jackson0419.service.IUserService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired(required = false)
    IUserDao userDao;

    @Override
    public User getUserByUserId(Long userId) {
        User userVO = userDao.getUserByUserId(userId);
        return userVO;
    }

    @Override
    public ResultVO getAllUser() {
        User user = new User();
        user.setUserList(userDao.getAllUser());
        return ResultUtil.returnResult(user);
    }
}
