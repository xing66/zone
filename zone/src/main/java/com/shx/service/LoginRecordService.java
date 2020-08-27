package com.shx.service;

import com.shx.pojo.LoginRecord;

import java.util.List;

public interface LoginRecordService {
    List<LoginRecord> select2();

    List<LoginRecord> select3();

    void add(LoginRecord loginRecord);
}
