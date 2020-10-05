package com.lesson.demo.entity.data;

import com.lesson.demo.entity.key.BillProductKey;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bill_has_product")
@Data
public class BillHasProduct implements Serializable {

    @EmbeddedId
    private BillProductKey id;

    private int amount;
    private double price;
//
//    @ManyToOne
//    @MapsId("productId") // tên của khoá ngoại trong EmbeddedId
//    @JoinColumn(name = "product_id") // khoá ngoại
//    private Product product;
//
//    @ManyToOne
//    @MapsId("billId")
//    @JoinColumn(name = "bill_id")
//    private Bill bill;


}
