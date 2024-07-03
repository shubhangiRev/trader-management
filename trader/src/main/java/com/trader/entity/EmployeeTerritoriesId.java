package com.trader.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class EmployeeTerritoriesId implements Serializable {
    @ManyToOne
    @JoinColumn(name="employee_id",referencedColumnName = "employee_id")
    public Employee employee;

    @ManyToOne
    @JoinColumn(name="territory_id",referencedColumnName = "territory_id")
    public Territories territories;

}
