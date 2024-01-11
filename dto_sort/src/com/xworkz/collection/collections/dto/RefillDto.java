package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RefillDto implements Serializable {
    private String colour;
    private double cost;
    private String brand;
    private boolean reusable;

}
