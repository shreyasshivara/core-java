package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Setter@Getter
@ToString
public class AlarmDTO implements Serializable,Comparable<AlarmDTO> {
    private String brand;
    private Double cost;
    private String colour;
    private String madeIn;
    @Override
    public int compareTo(AlarmDTO o) {
        return Double.compare(this.cost,o.getCost());
    }
}
