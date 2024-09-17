package com.example.demo.controller;

import com.example.demo.service.SellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/sell")
public class SellController {

    private final SellService sellService;

    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @GetMapping("/getSell")
    public Map<String, Object> getSell(@RequestParam Long id) {
        return sellService.getSell(id);
    }    
}
