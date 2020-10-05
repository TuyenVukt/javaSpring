package com.lesson.demo.test;

import com.lesson.demo.entity.data.Brand;
import com.lesson.demo.repo.BrandRepoExample;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BrandControllerTest {
    private final BrandRepoExample brandRepo;

    @GetMapping("api/public/brands/{id}")
    public ResponseEntity<Brand> findById(@PathVariable("id") int id) throws Exception {
        return ResponseEntity.ok(brandRepo.findById(id));
    }

}
