package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class VentilatorDTO implements Serializable {
    private String brand;
    private double cost;
    private String colour;
    private String type;
}
