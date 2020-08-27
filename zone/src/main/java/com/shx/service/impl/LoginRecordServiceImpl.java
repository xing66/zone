package com.shx.service.impl;

import com.shx.mapper.LoginRecordDao;
import com.shx.pojo.LoginRecord;
import com.shx.service.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginRecordServiceImpl implements LoginRecordService {

    @Autowired
    private LoginRecordDao loginRecordDao;

    public List<LoginRecord> select2() {
        return loginRecordDao.select2();
    }

    public List<LoginRecord> select3() {
        return loginRecordDao.select3();
    }

    public void add(LoginRecord loginRecord) {
        loginRecordDao.insert(loginRecord);
    }
}
