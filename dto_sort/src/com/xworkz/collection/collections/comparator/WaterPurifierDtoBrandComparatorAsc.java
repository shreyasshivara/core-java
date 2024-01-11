package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDtoBrandComparatorAsc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

    class WaterPurifierDtoBrandComparatorDesc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return o2.getBrand().compareTo(o1.getBrand());
        }
    }

    class WaterPurifierDtoCapacityComparatorAsc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Integer.compare(o1.getCapacity(), o2.getCapacity());
        }
    }

    class WaterPurifierDtoCapacityComparatorDesc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Integer.compare(o2.getCapacity(), o1.getCapacity());
        }
    }

    class WaterPurifierDtoColourComparatorAsc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return o1.getColour().compareTo(o2.getColour());
        }
    }

    class WaterPurifierDtoColourComparatorDesc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return o2.getColour().compareTo(o1.getColour());
        }
    }

    class WaterPurifierDtoCostComparatorDesc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Double.compare(o2.getCost(), o1.getCost() );
        }
    }

    class WaterPurifierDtoCostComparatorAsc implements Comparator<WaterPurifierDTO> {

        @Override
        public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
            return Double.compare(o1.getCost(), o2.getCost());
        }
    }
