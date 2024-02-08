package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@Getter

        @Setter
        @AllArgsConstructor
@NoArgsConstructor
@ToString

public class WingsDTO implements Serializable,Comparable<WingsDTO> {
    private int lengthInMm;
    private String colour;
    private String bird;
    private String size;
    @Override
    public int compareTo(WingsDTO o) {
        return this.colour.compareTo(o.getColour());
    }
}
