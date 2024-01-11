package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShipDTO implements Serializable {
    private String name;
    private String country;
    private int mfy;
    private float lengthInMtr;
}
