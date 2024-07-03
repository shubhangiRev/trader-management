package com.trader.entity;

    import lombok.Data;

    import javax.persistence.*;
    import java.util.Set;

    @Entity
    @Table(name="Customers")
    @Data
    public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "customer_id", length = 5)
       private Integer  customerID;

        @Column(name= "company_name",nullable = false,length = 40)
       private String companyName;

        @Column(name= "contact_name",length = 30)
       private String contactName;

        @Column(name= "contact_title",length = 30)
       private String contactTitle;

        @Column(length = 60)
       private String address;

        @Column(length = 15)
       private String city;

        @Column(length = 15)
       private String region;

        @Column(name = "postal_code", length = 10)
       private String postalCode;

        @Column(length = 15)
       private String country;

        @Column(length = 24)
       private String phone;

        @Column(length = 24)
       private String fax;

        @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
        private Set<Order> orders;


    }
