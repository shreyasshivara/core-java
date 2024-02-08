package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RopeDto implements Serializable,Comparable<RopeDto> {
    private String colour;
    private double costInRs;
    private String size;
    private String type;
    @Override
    public int compareTo(RopeDto o) {
        return this.size.compareTo(o.getSize());
    }
}
