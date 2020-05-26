package com.shx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
public class UserController {

    @RequestMapping("/")
    public String home() {
        return "index.html";
    }


    @RequestMapping("/tlogin")
    public String  showLogin() {
        return "login.html";
    }


}
