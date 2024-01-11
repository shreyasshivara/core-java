package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RadioDTO implements Serializable {
    private String brand;
    private double cost;
    private int warrantyInYr;
    private String colour;
}
