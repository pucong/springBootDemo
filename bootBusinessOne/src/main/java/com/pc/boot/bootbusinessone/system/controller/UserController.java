package com.pc.boot.bootbusinessone.system.controller;

import com.pc.config.security.CustomUserService;
import com.pc.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by PC on 2017/7/24.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CustomUserService customUserService;

    @RequestMapping("/menu")
    public Map<String,Object> home(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Map<String,Object> map=userService.findUserByid(1);
        return map;
    }
}
