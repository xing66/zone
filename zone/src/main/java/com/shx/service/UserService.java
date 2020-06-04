package com.shx.service;

import com.shx.pojo.User;

/**
 * ClassName: UserService
 * Description:
 * date: 2020/5/25 20:22
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
public interface UserService {

     User findByUsername(String username);

    User login(User user);
}
