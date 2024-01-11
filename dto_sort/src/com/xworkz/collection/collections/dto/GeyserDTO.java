package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class GeyserDTO implements Serializable {
    private String brand;
    private int capacityInLtrs;
    private String colour;
    private int warrantyInYr;
}
