package com.lesson.demo.utils.repo;

import com.lesson.demo.utils.model.SpringOutfit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class SpringOutfitRepo_Impl implements SpringOutfitRepo{
    private List<SpringOutfit> springOutfits;
    @PostConstruct//khởi tạo một cơ sở dữ liệu fake
    public void fakeData(){
        System.out.println("init fake data");
        springOutfits = new ArrayList<>();

        springOutfits.add(new SpringOutfit(1,"T-shirt1",3000));
        springOutfits.add(new SpringOutfit(2,"T-shirt2",4000));
        springOutfits.add(new SpringOutfit(3,"T-shirt3",5000));
        springOutfits.add(SpringOutfit.builder()
                .id(4)
                .name("T-shirt4")
                .price(5000).build());
        springOutfits.add(SpringOutfit.builder()
                .id(5)
                .name("lol")
                .price(900).build());
    }
    @Override
    public List<SpringOutfit> findAll() {
        return springOutfits;
    }
}
