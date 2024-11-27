package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id", length = 10)
    private int employeeID;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 10)
    private String firstName;

    @Column(length = 30)
    private String title;

    @Column(name = "title_of_courtesy", length = 25)
    private String titleOfCourtesy;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "hire_date")
    private Date hireDate;

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

    @Column(name = "home_phone", length = 24)
    private String homePhone;

    @Column(length = 4)
    private String extension;

    @Lob
    private byte[] photo;

    @Lob()
    @Column
    private String notes;

    @Column(name = "photo_path", length = 255)
    private String photoPath;

    @Column
    private int salary;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<Order> orders;

    
}
