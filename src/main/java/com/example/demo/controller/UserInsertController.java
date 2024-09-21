package com.example.demo.controller;

import com.example.demo.service.UserInsertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import java.util.List;

import java.util.Map;

@RestController
@RequestMapping("/userInsert")
public class UserInsertController {

    private final UserInsertService userInsertService;

    public UserInsertController(UserInsertService userInsertService) {
        this.userInsertService = userInsertService;
    }

    @GetMapping("/getUserInsert")
    public void getUserInsert(@RequestParam Long id) {
        userInsertService.getUserInsert(id);
    }    
}
