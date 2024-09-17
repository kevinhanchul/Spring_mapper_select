package com.example.demo.service;

import com.example.demo.mapper.SellMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SellService {

    private final SellMapper sellMapper;

    public SellService(SellMapper sellMapper) {
        this.sellMapper = sellMapper;
    }

    public Map<String, Object> getSell(Long id) {
        String USER_NAME = (String) sellMapper.selSell(id);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("USER_NAME", USER_NAME);
//        resultMap.put("sell", sell);
        return resultMap;
    }
}
