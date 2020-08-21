package com.shx.service.impl;

import com.shx.mapper.UserDao;
import com.shx.pojo.User;
import com.shx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Description:
 * date: 2020/5/25 20:23
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }


    public User login(User user) {
        return userDao.selectOne(user);
    }
}
