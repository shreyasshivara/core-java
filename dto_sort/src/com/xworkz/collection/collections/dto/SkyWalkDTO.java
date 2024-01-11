package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkyWalkDTO implements Serializable {
    private int distenceInMtr;
    private int constYr;
    private int hight;
    private String name;
}
