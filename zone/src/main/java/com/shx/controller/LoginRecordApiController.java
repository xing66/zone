package com.shx.controller;

import com.shx.pojo.LoginRecord;
import com.shx.pojo.Result;
import com.shx.service.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loginRecord")
public class LoginRecordApiController {

    @Autowired
    private LoginRecordService loginRecordService;


    @GetMapping("/select2")
    public Result<List<LoginRecord>> select2(){
        List<LoginRecord> list = loginRecordService.select2();
        if (null != list && list.size()> 0 ){
            return new Result<List<LoginRecord>>(true,"查询成功",list);
        }
        return new Result<List<LoginRecord>>(false,"查询失败");
    }

    @GetMapping("/select3")
    public Result<List<LoginRecord>> select3(){
        List<LoginRecord> list = loginRecordService.select3();
        if (null != list && list.size()> 0 ){
            return new Result<List<LoginRecord>>(true,"查询成功",list);
        }
        return new Result<List<LoginRecord>>(false,"查询失败");
    }
}
