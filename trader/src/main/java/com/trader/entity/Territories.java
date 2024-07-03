package com.trader.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Territories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "territory_id", length = 20)
    private int territoryID;

    @Column(name = "territory_description", nullable = false, length = 50)
    private String territoryDescription;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
