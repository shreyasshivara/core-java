package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class SparkPlugDto implements Serializable {
    private String brand;
    private double cost;
    private String colour;
    private String usedFor;
}
