package com.xworkz.dto.runner;

import com.xworkz.dto.thing.BloodPreasureDTO;

public class BloodPreasureStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in BloodPreasure Starter");
        BloodPreasureDTO bloodPreasureDTO=new BloodPreasureDTO("Shreyas",120,82,9876543201l,13.50,85,23,"trinity","ravikumar");
        BloodPreasureDTO bloodPreasureDTO1=new BloodPreasureDTO("Shreyas",120,82,9876543201l,13.50,85,23,"trinity","ravikumar");
        boolean same=bloodPreasureDTO.equals(bloodPreasureDTO1);
        System.out.println(same);
        System.out.println(bloodPreasureDTO);
        System.out.println(bloodPreasureDTO1);


        System.out.println("Ending main in BloodPreasure Starter");
    }
}
