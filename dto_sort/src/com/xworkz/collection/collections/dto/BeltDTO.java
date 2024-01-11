package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BeltDTO implements Serializable {
    private String brand;
    private double cost;
    private String material;
    private String colour;
}
