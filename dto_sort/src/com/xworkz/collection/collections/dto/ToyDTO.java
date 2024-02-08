package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ToyDTO implements Serializable,Comparable<ToyDTO> {
    private String name;
    private String material;
    private double cost;
    private String colour;




    @Override
    public int compareTo(ToyDTO o) {
        return this.name.compareTo(o.getName());
    }
}
