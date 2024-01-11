package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CharcoalDTO implements Serializable {
    private String colour;
    private int quantity;
    private double costPerKg;
    private String type;

}
