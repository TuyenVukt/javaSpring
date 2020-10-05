package com.lesson.demo.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CountProduct {
    private String topic;//đếm sản phẩm theo brand
    private long quantity;

}
