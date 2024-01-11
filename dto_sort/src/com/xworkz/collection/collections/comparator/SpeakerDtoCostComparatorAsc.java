package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.Comparator;

public class SpeakerDtoCostComparatorAsc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
