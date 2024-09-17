package com.example.demo.service;

import com.example.demo.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public Map<String, Object> getUserInfo(Long id) {
        String USER_NAME = (String) userInfoMapper.selUserInfo(id);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("USER_NAME", USER_NAME);
//        resultMap.put("userInfo", userInfo);
        return resultMap;
    }
}
