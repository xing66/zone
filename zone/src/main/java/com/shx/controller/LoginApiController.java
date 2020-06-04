package com.shx.controller;

import com.shx.pojo.Result;
import com.shx.pojo.User;
import com.shx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class LoginApiController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Result login(@RequestBody User user, HttpServletRequest request){
      User loginUser =   userService.login(user);
        if (loginUser != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",loginUser);
            return new Result(true,"登录成功!");
        }
        return new Result(false,"登录失败!用户名或密码错误!");
    }
}
