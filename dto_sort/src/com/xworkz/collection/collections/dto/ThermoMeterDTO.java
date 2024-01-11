package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ThermoMeterDTO implements Serializable {
    private String brand;
    private String type;
    private double cost;
    private String colour;
}
