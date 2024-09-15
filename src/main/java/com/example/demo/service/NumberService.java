package com.example.demo.service;

import com.example.demo.mapper.NumberMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NumberService {

    private final NumberMapper numberMapper;

    public NumberService(NumberMapper numberMapper) {
        this.numberMapper = numberMapper;
    }

    public Map<String, Object> getNumber(Long id) {
        String USER_NAME = (String) numberMapper.selectNumberById(id);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("USER_NAME", USER_NAME);
//        resultMap.put("number", number);
        return resultMap;
    }
}
