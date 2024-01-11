package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDTO implements Serializable {
    private String type;
    private String location;
    private double cost;
    private boolean is_any_charges;
}
