package com.lesson.demo.utils.controller;

import com.lesson.demo.utils.model.SpringOutfit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/public/test")
public class SpringOutfitTestController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    public SpringOutfit hello1(){
        return new SpringOutfit(1, "T-shirt", 3000);
    }



}
