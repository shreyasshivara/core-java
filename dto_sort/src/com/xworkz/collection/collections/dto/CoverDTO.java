package com.xworkz.collection.collections.dto;

import lombok.*;

import java.awt.*;
import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CoverDTO implements Serializable {
    private String material;
    private String colour;
    private String type;
    private double cost;
}
