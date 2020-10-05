package com.lesson.demo.test;

import com.lesson.demo.entity.data.Product;
import com.lesson.demo.repo.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.concurrent.ExecutorService;

@RestController
@AllArgsConstructor
@RequestMapping("api/public/products")
public class ProductControllerTest {
    private final  ProductRepo productRepo;
    private EntityManager entityManager;
    @PostMapping
    @Transactional
    public ResponseEntity<Void> post(@RequestBody Product product){
        product.setCategory(entityManager.getReference());
        product.setBrand();
        entityManager.persist(product);
        return
    }

}
