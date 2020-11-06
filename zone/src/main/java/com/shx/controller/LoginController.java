package com.shx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UserController
 * Description:
 * date: 2020/5/25 19:49
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */

@Controller
public class LoginController {

    @RequestMapping("/home")
    public String  index() {
        return "timer";
    }

    @RequestMapping("/select")
    public String  select() {
        return "select";
    }

    @RequestMapping("/love")
    public String  love() {
        return "love";
    }

    @RequestMapping("/login")
    public String  login() {
        return "login";
    }

    @RequestMapping("/homePage")
    public String  homePage() {
        return "homePage1";
    }


}
