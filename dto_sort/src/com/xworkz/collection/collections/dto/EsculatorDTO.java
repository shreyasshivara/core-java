package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class EsculatorDTO implements Serializable {
    private int totalSteps;
    private String type;
    private double cost;
    private String brand;

}
