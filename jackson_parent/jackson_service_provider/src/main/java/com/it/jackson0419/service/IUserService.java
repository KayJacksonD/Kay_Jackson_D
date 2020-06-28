package com.it.jackson0419.service;

import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.User;

import java.util.List;

public interface IUserService {

    User getUserByUserId(Long userId);

    ResultVO getAllUser();

}
