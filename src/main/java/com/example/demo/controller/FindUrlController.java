package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FindUrlController {
    
    @GetMapping("/numbers")
    private ModelAndView numbers() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("numbers");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/raceInfo")
    private ModelAndView raceInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("raceInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/runnerInfo")
    private ModelAndView runnerInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("runnerInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/sell")
    private ModelAndView sell() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sell");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @GetMapping("/userInfo")
    private ModelAndView userInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }
    
    @PostMapping("/add2")
    public Map<String, Integer> addNumbers(@RequestBody Map<String, String> numbers) throws Exception {
        Map<String, Integer> intNumbers = new HashMap<>();
        intNumbers.put("num1", Integer.parseInt(numbers.get("num1")));
        intNumbers.put("num2", Integer.parseInt(numbers.get("num2")));
        return intNumbers;
    }
}
