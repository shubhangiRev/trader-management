package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", length = 5)
    private int orderId;

    @Column(name = "order_date", length = 40)
    private Date orderDate;

    @Column(name = "required_date", length = 30)
    private Date requiredDate;

    @Column(name = "shipped_date", length = 30)
    private Date shippedDate;

    @Column(name = "ship_via", length = 30)
    private int shipVia;

    @Column(name = "freight", columnDefinition = "float default 0")
    private float freight;

    @Column(name = "Ship_name", length = 40)
    private String shipName;

    @Column(name = "ship_address", length = 60)
    private String shipAddress;

    @Column(name = "ship_city", length = 15)
    private int shipCity;

    @Column(name = "ship_region", length = 15)
    private String shipRegion;

    @Column(name = "ship_postal_code", length = 15)
    private String shipPostalCode;

    @Column(name = "ship_country", length = 15)
    private String shipCountry;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shipper shipper;


       }
