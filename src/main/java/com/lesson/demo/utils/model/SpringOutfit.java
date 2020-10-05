package com.lesson.demo.utils.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class SpringOutfit {
    private Integer id;
    private String name;
    private double price;
}
