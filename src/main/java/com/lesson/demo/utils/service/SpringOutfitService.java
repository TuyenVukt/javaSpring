package com.lesson.demo.utils.service;

import com.lesson.demo.utils.model.SpringOutfit;

import java.util.List;

public interface SpringOutfitService {
    public List<SpringOutfit> sortByName();
    public List<SpringOutfit> sortByPrice();
    public SpringOutfit findByName(String name);
    public SpringOutfit findById(int id) ;
    public List<SpringOutfit> findAll();
    void save(SpringOutfit springOutfit);
    boolean delete(int id);
}
