package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.CardBoardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardThicknessLambdaComparatorRunner {
    public static void main(String[] args) {
        CardBoardDTO cardBoardDTO = new CardBoardDTO(8, 500, "brown", "classmate");
        CardBoardDTO cardBoardDTO1 = new CardBoardDTO(10, 550, "black", "ajay");
        CardBoardDTO cardBoardDTO2 = new CardBoardDTO(12, 600, "white", "ajanta");
        CardBoardDTO cardBoardDTO3 = new CardBoardDTO(14, 650, "blue", "vidya");
        CardBoardDTO cardBoardDTO4 = new CardBoardDTO(16, 750, "green", "natraja");
        List<CardBoardDTO> list = new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);
        Collections.sort(list);
        System.out.println("After Asccc=======================");
        for (CardBoardDTO ref : list
        ) {
            System.out.println(ref);
        }
        Collections.sort(list, (c1, c2) -> c2.getThicknessInMM().compareTo(c1.getThicknessInMM()));
        System.out.println("After desc==============================");
        for (CardBoardDTO ref : list
        ) {
            System.out.println(ref);
        }
    }
}
