package com.xworkz.streams.dto;

import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MedicineDto {

    private String name;
    private int id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate mfd;
    private double cost;
    private String[] ingredients;

}
