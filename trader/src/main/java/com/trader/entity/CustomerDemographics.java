package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "CustomerDemographics")
public class CustomerDemographics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_type_id", length = 10, nullable = false)
    private String customerTypeID;

    @Lob()
    @Column(name = "customer_desc", nullable = false)
    private String customerDesc;

}
