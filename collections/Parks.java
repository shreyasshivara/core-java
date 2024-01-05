package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Parks {
    public static void main(String[] args) {
        Collection<String> parkNames = new ArrayList<>();
        parkNames.add("Vishweshwarayya");
        parkNames.add("Central");
        parkNames.add("Golden Gate");
        parkNames.add("Hyde");
        parkNames.add("Yosemite National");
        parkNames.add("Yellowstone National");
        parkNames.add("Grand Canyon National");
        parkNames.add("Everglades National");
        parkNames.add("Banff National");
        parkNames.add("Zion National");
        parkNames.add("Rocky Mountain National");
        parkNames.add("Serengeti National");
        parkNames.add("Denali National");
        parkNames.add("Acadia National");
        parkNames.add("Glacier National");
        parkNames.add("Arches National");
        parkNames.add("Sequoia National");
        parkNames.add("Bryce Canyon National");
        parkNames.add("Grand Teton National");
        parkNames.add("Mount Rainier National");
        parkNames.add("Kruger National");
        parkNames.add("Great Smoky Mountains National");
        parkNames.add("Mesa Verde National");
        parkNames.add("Death Valley National");
        parkNames.add("Joshua Tree National");
        parkNames.add("Redwood National and State");
        parkNames.add("Cuyahoga Valley National ");
        parkNames.add("Great Sand Dunes National");
        parkNames.add("Pinnacles National");
        parkNames.add("Shenandoah National");
        parkNames.add("Waterton Lakes National");
        parkNames.add("Biscayne National");
        parkNames.add("Kakadu National");
        parkNames.add("Haleakalā National");
        parkNames.add("Petrified Forest National");
        parkNames.add("Wind Cave National");
        parkNames.add("Badlands National");
        parkNames.add("Isle Royale National");
        parkNames.add("Lassen Volcanic National");
        parkNames.add("Voyageurs National ");
        parkNames.add("Canyonlands National ");
        parkNames.add("Kings Canyon National ");
        parkNames.add("Hot Springs National ");
        parkNames.add("Black Canyon of the Gunnison National ");
        parkNames.add("Theodore Roosevelt National ");
        parkNames.add("Capitol Reef National ");
        parkNames.add("Congaree National ");
        parkNames.add("Virgin Islands National ");
        parkNames.add("Guadalupe Mountains National ");
        parkNames.add("Olympic National ");
        parkNames.add("North Cascades National");
        parkNames.add("Big Bend National");
        parkNames.add("Cajas National");
        parkNames.add("Lahemaa National");
        parkNames.add("Göreme National ");
        parkNames.add("Erawan National ");
        parkNames.add("Yoho National ");
        parkNames.add("Mauricie National ");
        parkNames.add("Jiuzhaigou Valley National");
        parkNames.add("Mesa Verde National");
        parkNames.add("Komodo National");
        parkNames.add("Snowdonia National");
        parkNames.add("Kluane National");
        parkNames.add("Galápagos National");
        parkNames.add("Hwange National");
        parkNames.add("Daintree National");
        parkNames.add("Plitvice Lakes National");
        parkNames.add("Torres del Paine National");
        parkNames.add("Mulu National");
        parkNames.add("Aoraki / Mount Cook National");
        parkNames.add("Kruger National");
        parkNames.add("Yosemite National");
        parkNames.add("Cubbon ");
        parkNames.add("Childrans");
        parkNames.add("Gas gase");
        parkNames.add("Rock garden");
        parkNames.add("kaziranga National");
        parkNames.add("bannergatta");
        parkNames.add("Gandi ");
        parkNames.add("Rammanna setty");
        parkNames.add("Maharaja");
        Iterator<String> itr =parkNames.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
            if(ref.startsWith("b")||ref.endsWith("k")){
                System.out.println(ref);
            }
        }


    }

    }

