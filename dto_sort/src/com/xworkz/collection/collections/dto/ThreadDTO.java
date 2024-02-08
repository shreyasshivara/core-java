package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class ThreadDTO implements Serializable,Comparable<ThreadDTO> {
    private int lengthInCm;
    private String colour;
    private int widthInMm;
    private String type;
    @Override
    public int compareTo(ThreadDTO o) {
        return Integer.compare(this.lengthInCm,o.getLengthInCm());
    }
}
