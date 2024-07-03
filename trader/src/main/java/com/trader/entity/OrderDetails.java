package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetails {
    @EmbeddedId
    private OrderDetailsId id;

    @Column(name = "unit_price",nullable = false,columnDefinition = "float default 999999.99")
    private  float unitPrice;

    @Column(name = "quantity",nullable = false,columnDefinition = "integer default 1 ")
    private int quantity;

    @Column(name = "discount",nullable = false,columnDefinition = "integer default 0 ")
    private double discount;


}
