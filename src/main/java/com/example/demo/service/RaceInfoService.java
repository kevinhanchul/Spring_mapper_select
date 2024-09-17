package com.example.demo.service;

import com.example.demo.mapper.RaceInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RaceInfoService {

    private final RaceInfoMapper raceInfoMapper;

    public RaceInfoService(RaceInfoMapper raceInfoMapper) {
        this.raceInfoMapper = raceInfoMapper;
    }

    public Map<String, Object> getRaceInfo(Long id) {
        String USER_NAME = (String) raceInfoMapper.selRaceInfo(id);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("USER_NAME", USER_NAME);
//        resultMap.put("raceInfo", raceInfo);
        return resultMap;
    }
}
