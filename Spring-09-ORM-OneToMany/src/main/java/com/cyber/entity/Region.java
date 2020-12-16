package com.cyber.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regions")
@NoArgsConstructor
@Getter
@Setter
public class Region extends BaseEntity{

    private String region;
    private String county;

    public Region(String region, String county) {
        this.region = region;
        this.county = county;
    }
}
