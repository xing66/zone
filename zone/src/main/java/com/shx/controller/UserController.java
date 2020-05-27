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
public class UserController {

    @RequestMapping("index")
    public String home() {
        return "/index";
    }


    @RequestMapping("signIn")
    public String  showLogin() {
        return "/login";
    }

    @RequestMapping("errorPage")
    public String  errorPage() {
        return "/error";
    }

}
