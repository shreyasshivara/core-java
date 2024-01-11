package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.Comparator;

public class PaperDtoBrandComparatorAsc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());

    }
}
