package com.trader.dto;

import lombok.Data;

@Data

public class ProductDto {

    private int productID;
    private String productName ;
    private int SupplierID  ;
    private int CategoryID ;
    private String quantityPerUnit;
    private float unitPrice  ;
    private int unitsInStock  ;
    private int unitsOnOrder ;
    private int ReorderLevel ;
    private Boolean discontinued  ;
}
