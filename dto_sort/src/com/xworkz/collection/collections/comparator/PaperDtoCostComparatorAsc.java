package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.Comparator;

public class PaperDtoCostComparatorAsc implements Comparator<PaperDTO> {


    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getCost(),o2.getCost());
    }
}
