package com.trader.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EmployeeTerritories")
public class EmployeeTerritories {

    @EmbeddedId
    private EmployeeTerritoriesId id;





}
