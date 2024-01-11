package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SensorDTO implements Serializable {
    private String brand;
    private double cost;
    private int distenceInMtr;
    private String type;
}
