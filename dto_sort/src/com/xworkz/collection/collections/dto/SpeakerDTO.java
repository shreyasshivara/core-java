package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpeakerDTO implements Serializable {
    private String brand;
    private Double cost;
    private String colour;
    private String warranty;
}
