package com.xworkz.collection.collections.dto;

import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class StreetDTO implements Serializable {
    private int widthInMtr;
    private int lengthInMtr;
    private String location;
    private String name;
}
