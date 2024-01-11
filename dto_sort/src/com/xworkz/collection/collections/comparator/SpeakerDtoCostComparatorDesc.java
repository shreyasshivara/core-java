package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerDtoCostComparatorDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
