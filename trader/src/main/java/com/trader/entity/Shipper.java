package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Shippers")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipper_id", length = 5)
    private int shipperID;

    @Column(name = "company_name", nullable = false, length = 40)
    private String companyName;

    @Column(name = "phone", nullable = false, length = 24)
    private String phone;

    @OneToMany(mappedBy = "shipper",cascade = CascadeType.ALL)
    private Set<Order> orders;

}
