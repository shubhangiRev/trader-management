package com.trader.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", length = 5)
    private int productID;

    @Column(name= "product_name",length = 40)
    private String productName ;

    @Column(name= "supplier_id",length = 30)
    private int SupplierID  ;

    @Column(name= "category_id",length = 30)
    private int CategoryID ;

    @Column(name= "quantity_per_unit",length = 30)
    private String quantityPerUnit;

    @Column(name= "unit_price",length = 30,columnDefinition = "integer default 0")
    private float unitPrice  ;

    @Column(name= "units_in_stock",length = 30,columnDefinition = "integer default 0")
    private int unitsInStock  ;

    @Column(name= "units_on_order",length = 30,columnDefinition = "integer default 0")
    private int unitsOnOrder ;

    @Column(name= "reorder_level",length = 30,columnDefinition = "integer default 0")
    private int ReorderLevel ;

    @Column(name= "discontinued",length = 30)
    private Boolean discontinued  ;

}
