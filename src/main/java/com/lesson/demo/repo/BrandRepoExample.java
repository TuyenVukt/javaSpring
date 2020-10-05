package com.lesson.demo.repo;

import com.lesson.demo.entity.data.Brand;
import com.lesson.demo.entity.query.CountProduct;

import java.util.List;

public interface BrandRepoExample {
    public Brand findById(int id) throws Exception;
    public  Long count();
    public List<Brand> findAll();
    public List<Brand> findByName(String name);
    public boolean insert(Brand brand);
    public boolean update(Brand brand);
    public boolean delete(int id);
    List<CountProduct> countProduct();
}
