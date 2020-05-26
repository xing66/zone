package com.shx.mapper;

import com.shx.pojo.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * ClassName: UserDao
 * Description:
 * date: 2020/5/25 23:09
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
public interface UserDao extends Mapper<User> {

    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUsername(String username);

}
