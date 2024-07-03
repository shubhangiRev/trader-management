package com.trader.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "CustomerCustomerDemo")
public class CustomerCustomerDemo {

    @EmbeddedId
    private CustomerCustomerDemoId id;
}
