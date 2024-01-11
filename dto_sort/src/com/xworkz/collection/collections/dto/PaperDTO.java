package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaperDTO implements Serializable {
    private String brand;
    private String dimension;
    private String colour;
    private double cost;
}
