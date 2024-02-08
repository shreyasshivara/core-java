package com.xworkz.collection.collections.dto;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO> {
    private Integer thicknessInMM;
    private int lengthINMM;
    private String colour;
    private String brand;
    @Override
    public int compareTo(CardBoardDTO o) {
        return Integer.compare(this.thicknessInMM,o.getThicknessInMM());
    }

}
