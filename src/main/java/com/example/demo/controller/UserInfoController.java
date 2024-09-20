package com.example.demo.controller;

import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import java.util.List;

import java.util.Map;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/getUserInfo")
    public Map<String, Object> getUserInfo(@RequestParam Long id) {
        return userInfoService.getUserInfo(id);
    }    
}
