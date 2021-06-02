package com.elite.springbootbootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 用户控制类登录
 */
@Controller
public class UserLoginController {

    /**
     * 登录
     * @param username
     * @param password
     * @param map
     * @param session
     * @return
     */
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登录成功
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名或者密码错误！");
            return "login";
        }
    }
    /**
     * 退出登录
     */
    @RequestMapping("/user/logout")
    public String logout(){
        return "login";
    }
}
