package com.shx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @RequestMapping("/index")
    public String  index(ModelMap map) {
        return "index";
    }

    @RequestMapping("/login")
    public String  login(ModelMap map) {
        return "login";
    }

}
