package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TeleScopeDTO implements Serializable {
    private String brand;
    private String colour;
    private double cost;
    private int warrantyInYrs;
}
