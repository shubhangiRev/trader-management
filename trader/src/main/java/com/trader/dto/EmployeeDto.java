package com.trader.dto;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeDto {
    private int employeeID;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private byte[] photo;
    private String notes;
    private String photoPath;
    private int salary;
}
