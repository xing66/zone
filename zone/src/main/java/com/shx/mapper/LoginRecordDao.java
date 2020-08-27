package com.shx.mapper;


import com.shx.pojo.LoginRecord;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LoginRecordDao extends Mapper<LoginRecord> {

    @Select("select * from loginRecord order by login_time desc LIMIT 0,2")
    List<LoginRecord> select2();

    @Select("select * from loginRecord order by login_time desc LIMIT 0,3")
    List<LoginRecord> select3();
}
