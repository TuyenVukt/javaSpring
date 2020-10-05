package com.lesson.demo.entity.key;

import javax.persistence.Column;
import java.io.Serializable;

public class BillProductKey implements Serializable {
    @Column(name = "bill_id")
    private Integer billId;

    @Column(name = "product_id")
    private Integer productId;
}
