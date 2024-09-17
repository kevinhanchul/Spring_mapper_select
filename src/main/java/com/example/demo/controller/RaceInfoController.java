package com.example.demo.controller;

import com.example.demo.service.RaceInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/raceInfo")
public class RaceInfoController {

    private final RaceInfoService raceInfoService;

    public RaceInfoController(RaceInfoService raceInfoService) {
        this.raceInfoService = raceInfoService;
    }

    @GetMapping("/getRaceInfo")
    public Map<String, Object> getRaceInfo(@RequestParam Long id) {
        return raceInfoService.getRaceInfo(id);
    }    
}
