package com.shx.mapper;

import com.shx.pojo.Message;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MessageDao extends Mapper<Message> {

    @Select("select * from message order by create_time desc LIMIT 0,3")
    List<Message> select3();
}
