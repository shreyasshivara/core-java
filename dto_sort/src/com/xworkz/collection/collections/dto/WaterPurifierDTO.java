package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
        @ToString
        @Getter
@Setter
public class WaterPurifierDTO implements Serializable {
    private String brand;
    private int capacity;
    private String colour;
    private double cost;

}
