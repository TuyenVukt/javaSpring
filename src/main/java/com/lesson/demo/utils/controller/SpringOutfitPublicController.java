package com.lesson.demo.utils.controller;

import com.lesson.demo.utils.model.SpringOutfit;
import com.lesson.demo.utils.service.SpringOutfitService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/public/")
public class SpringOutfitPublicController {
    private final SpringOutfitService springOutfitService ;
    @GetMapping("outfits")
    public ResponseEntity<List<SpringOutfit>> findAll(){
        return  ResponseEntity.status(HttpStatus.OK).body(springOutfitService.sortByName());
    }
    @GetMapping("outfitsByName")
    public SpringOutfit findByName(@RequestParam(value = "id",required = false,defaultValue = "0")int id,
                                   @RequestParam(value = "name",required = false, defaultValue = "")String name)
                                    throws Exception{
        int a = 1/0;

        return new SpringOutfit(id, name, 3000);
    }
}
