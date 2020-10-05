package com.lesson.demo.utils.controller;

import com.lesson.demo.utils.model.SpringOutfit;
import com.lesson.demo.utils.service.SpringOutfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("api/admin/spring-outfit")
public class SpringOutfitAdminController {
    @Autowired
    private SpringOutfitService springOutfitService;

    @PostMapping
    public String upload(@RequestBody SpringOutfit springOutfit){
        //insert here
        springOutfitService.save(springOutfit);
        return "insert success";
    }

    @PutMapping
    public String update(@RequestBody SpringOutfit springOutfit){
        springOutfitService.save(springOutfit);
        return "update success";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id, HttpServletResponse response){
        if (springOutfitService.delete(id)){
            return ResponseEntity.ok("delete success");

        }
        return ResponseEntity.notFound().build();
    }
}
