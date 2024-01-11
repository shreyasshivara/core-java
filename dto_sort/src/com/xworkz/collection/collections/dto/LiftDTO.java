package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LiftDTO implements Serializable {
    private String brand;
    private int capacityInKg;
    private double cost;
    private int noOfFloars;
}
