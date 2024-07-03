package com.trader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "region_id", length = 5)
    private int regionID;

    @Column(name = "region_description", nullable = false, length = 50)
    private String regionDescription;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private Set<Territories> territories;


}
