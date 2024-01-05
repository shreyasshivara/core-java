package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BodyParts {
    public static void main(String[] args) {
        String[] bodyParts = {
                "Head",
                "Neck",
                "Shoulder",
                "Arm",
                "Elbow",
                "Forearm",
                "Wrist",
                "Hand",
                "Fingers",
                "Thumb",
                "Chest",
                "Back",
                "Spine",
                "Abdomen",
                "Hip",
                "buttocks",
                "Groin",
                "Thigh",
                "Knee",
                "Shin",
                "Calf",
                "Ankle",
                "Foot",
                "Toes",
                "Heel",
                "Sole",
                "Eye",
                "Eyebrow",
                "Eyelash",
                "Ear",
                "Nose",
                "Mouth",
                "Lips",
                "Tongue",
                "Teeth",
                "Jaw",
                "Chin",
                "Cheek",
                "Forehead",
                "Skull",
                "Brain",
                "Esophagus",
                "Trachea",
                "Lungs",
                "Heart",
                "Liver",
                "Stomach",
                "Intestines",
                "Kidneys",
                "Bladder",
                "Pancreas",
                "Spleen",
                "Gallbladder",
                "Blood vessels",
                "Muscles",
                "Bones",
                "Joints",
                "Skin",
                "Hair",
                "Nails",
                "Nerves",
                "Thyroid",
                "Adrenal glands",
                "Pituitary gland",
                "Reproductive organs",
                "Uterus",
                "Ovaries",
                "Testes",
                "Prostate",
                "Penis",
                "Vagina",
                "Breasts",
                "Lymph nodes",
                "Sweat glands",
                "Salivary glands",
                "Tonsils",
                "Appendix",
                "Uvula"
        };
        Collection<String> parts = new ArrayList<>();

        for (int i = 0; i < bodyParts.length; i++) {
            parts.add(bodyParts[i]);
        }
        Iterator<String> ref=parts.iterator();
        while(ref.hasNext()){
            String part=ref.next();
            if(part.length()<5)
            System.out.println(part);


    }

        }
    }

