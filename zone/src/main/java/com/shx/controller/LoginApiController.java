package com.shx.controller;

import com.shx.pojo.LoginRecord;
import com.shx.pojo.Result;
import com.shx.pojo.User;
import com.shx.service.LoginRecordService;
import com.shx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class LoginApiController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginRecordService loginRecordService;


    @RequestMapping("/login")
    public Result login(@RequestBody User user, HttpServletRequest request){
      User loginUser =   userService.login(user);
        if (loginUser != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",loginUser);
            //添加登录记录
            LoginRecord loginRecord = new LoginRecord();
            loginRecord.setLoginUser(loginUser.getUsername());
            loginRecord.setLoginTime(new Date());
            loginRecordService.add(loginRecord);

            return new Result(true,"登录成功!");
        }
        return new Result(false,"非请勿进~");
    }
}
