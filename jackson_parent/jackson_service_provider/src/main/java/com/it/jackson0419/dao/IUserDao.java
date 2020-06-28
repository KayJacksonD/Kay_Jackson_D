package com.it.jackson0419.dao;

import com.it.jackson0419.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    User getUserByUserId(Long userId);

    List<User> getAllUser();

}
