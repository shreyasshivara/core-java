package com.xworkz.streams.runner;

import com.xworkz.streams.dto.MedicineDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineRunner {
    public static void main(String[] args) {
        String[] doloIngrediants={"aceclofenac","paracetamol","serratiopeptidase"};
        String[] action500Ingrediants={"Diphenhydramine","paracetamol","Phenylephrine"};
        String[] rantaxIngrediants={" Ranitidine"," Domperidone","histamine H2"};
        String[] humanmixturedIngrediants={" Human insulin","Insulin isophane"};
        String[] glimiprideIngrediants={" lactose","povidone","magnesium stearate."};
        String[] ecoSprinIngrediants={"Atorvastatin","Aspirin"};
        String[] cpmIngrediants={"Chlorpheniramine"};
        String[] amoxicillinIngrediants={"Colloidal Silicon Dioxide","Magnesium Stearate","Polyethylene Glycol"};
        String[] azithromycinIngrediants={" dibasic calcium phosphate anhydrous"," pregelatinized starch","sodium croscarmellose"};
        String[] augmentinIngrediants={"aceclofenacColloidal silicon dioxide","hypromellose","magnesium stearate"};
        String[] ciprofloxacinIngrediants={"cornstarch","microcrystalline cellulose","silicon dioxide"};
        String[] AmphotericinIngrediants={"amphotericin B","USP","cholesterol"};
        String[] DoxycyclineIngrediants={"Doxycycline Hyclate Tablets USP","croscarmellose sodium","magnesium stearate"};
        String[] humiraIngrediants={"mannitol","citric acid monohydrate","sodium citrate"};
        String[] ciprofloxacinIngrediant={"cornstarch","silicon dioxide","polyethylene glycol"};
        String[] apixabanIngrediants={"anhydrous lactose","microcrystalline cellulose","croscarmellose sodium"};
        String[] afliberceptIngrediants={"aflibercept"};
        String[] imbruvicaIngrediants={"ibrutinib","magnesium stearate","microcrystalline cellulose"};
        String[] xareltoIngrediants={"rivaroxaban","microcrystalline cellulose"," croscarmellose sodium"};
        String[] diclofenacIngrediants={"copolyvidone","crospovidone","serratiopeptidase"};
        MedicineDto medicineDto=new MedicineDto("Dolo650",1,"micro labs", LocalDate.of(2024,12,31),LocalDate.of(2023,12,31),50.0D,doloIngrediants);
        MedicineDto medicineDto1=new MedicineDto("Action500",2,"Procter and Gamble", LocalDate.of(2023,12,31),LocalDate.of(2022,12,31),100.0D,action500Ingrediants);
        MedicineDto medicineDto2=new MedicineDto("rantax",3,"Sanofi", LocalDate.of(2022,12,31),LocalDate.of(2021,12,31),70.0D,rantaxIngrediants);
        MedicineDto medicineDto3=new MedicineDto("human mixtured",4,"Novo Nordisk India Pvt. ltd", LocalDate.of(2025,12,31),LocalDate.of(2020,12,31),550.0D,humanmixturedIngrediants);
        MedicineDto medicineDto4=new MedicineDto("glimipride",5," Beilu Pharma", LocalDate.of(2021,12,31),LocalDate.of(2019,12,31),500.0D,glimiprideIngrediants);
        MedicineDto medicineDto5=new MedicineDto("EcoSprin",6," USV PVT. LTD", LocalDate.of(2020,12,31),LocalDate.of(2018,12,31),560.0D,ecoSprinIngrediants);
        MedicineDto medicineDto6=new MedicineDto("CPM",7," cipla", LocalDate.of(2019,12,31),LocalDate.of(2017,12,31),510.0D,cpmIngrediants);
        MedicineDto medicineDto7=new MedicineDto("Amoxicillin",8,"Amoxicillin Medicines manufacturers", LocalDate.of(2026,12,31),LocalDate.of(2023,11,5),250.0D,amoxicillinIngrediants);
        MedicineDto medicineDto8=new MedicineDto("Azithromycin",9,"Saphnix Lifesciences", LocalDate.of(2022,11,4),LocalDate.of(2023,10,31),150.0D,azithromycinIngrediants);
        MedicineDto medicineDto9=new MedicineDto("Augmentin",10,"Glaxo SmithKline Pharmaceuticals Ltd.", LocalDate.of(2024,10,31),LocalDate.of(2023,9,2),350.0D,augmentinIngrediants);
        MedicineDto medicineDto10=new MedicineDto("Ciprofloxacin",11,"Cipro-p", LocalDate.of(2024,9,3),LocalDate.of(2023,8,31),650.0D,ciprofloxacinIngrediants);
        MedicineDto medicineDto11=new MedicineDto("Amphotericin",12,"Xellia Pharmaceuticals", LocalDate.of(2024,8,31),LocalDate.of(2023,7,31),250.0D,AmphotericinIngrediants);
        MedicineDto medicineDto12=new MedicineDto("Doxycycline",13,"Pfizer Inc.", LocalDate.of(2024,7,31),LocalDate.of(2023,6,1),590.0D,DoxycyclineIngrediants);
        MedicineDto medicineDto13=new MedicineDto("Humira",14,"AbbVie Inc", LocalDate.of(2024,6,3),LocalDate.of(2023,5,3),80.0D,humiraIngrediants);
        MedicineDto medicineDto14=new MedicineDto("Apixaban",15,"Bristol-Myers Squibb Co", LocalDate.of(2024,5,1),LocalDate.of(2023,4,1),100.0D,ciprofloxacinIngrediant);
        MedicineDto medicineDto15=new MedicineDto("Aflibercept",16,"Bayer/Regeneron Pharmaceuticals/Sanofi.", LocalDate.of(2024,4,1),LocalDate.of(2023,3,3),530.0D,apixabanIngrediants);
        MedicineDto medicineDto16=new MedicineDto("Imbruvica",17,"Pharmacyclics LLC, an AbbVie Company, and Janssen Biotech, Inc.", LocalDate.of(2024,3,31),LocalDate.of(2024,4,3),500.0D,afliberceptIngrediants);
        MedicineDto medicineDto17=new MedicineDto("Xarelto",18,"Janssen Pharmaceuticals, Inc.", LocalDate.of(2024,2,1),LocalDate.of(2023,1,31),510.0D,imbruvicaIngrediants);
        MedicineDto medicineDto18=new MedicineDto("Diclofenac",19,"Elam Pharma", LocalDate.of(2024,1,31),LocalDate.of(2023,12,1),280.0D,xareltoIngrediants);
        MedicineDto medicineDto19=new MedicineDto("Dolo650",20,"micro labs", LocalDate.of(2024,12,25),LocalDate.of(2023,12,3),320.0D,diclofenacIngrediants);

        List<MedicineDto> list=new ArrayList<>();
        list.add(medicineDto);
        list.add(medicineDto1);
        list.add(medicineDto2);
        list.add(medicineDto3);
        list.add(medicineDto4);
        list.add(medicineDto5);
        list.add(medicineDto6);
        list.add(medicineDto7);
        list.add(medicineDto8);
        list.add(medicineDto9);
        list.add(medicineDto10);
        list.add(medicineDto11);
        list.add(medicineDto12);
        list.add(medicineDto13);
        list.add(medicineDto14);
        list.add(medicineDto15);
        list.add(medicineDto16);
        list.add(medicineDto17);
        list.add(medicineDto18);
        list.add(medicineDto19);

        list.stream().sorted((p1,p2)->p1.getCompany().compareToIgnoreCase(p2.getCompany())).forEach(r-> System.out.println(r));
        System.out.println("sorting all by exp date desc ================================================================================================================");
        list.stream().sorted((p1,p2)->p2.getExpiryDate().compareTo(p1.getExpiryDate())).forEach(r-> System.out.println(r));
        System.out.println("sorting all by cost asc ================================================================================================================");
        list.stream().sorted((p1,p2)->Double.compare(p1.getCost(), p2.getCost())).forEach(r-> System.out.println(r));
        System.out.println(" collectiong all elements where ingrediants is >3================================================================================================================");
        list.stream().filter(r->r.getIngredients().length>3).collect(Collectors.toList()).forEach(e-> System.out.println(e));
        System.out.println(" collect ONLY INGREDIANTS ================================================================================================================");
/*
        list.stream().map(MedicineDto::getIngredients).map(String::).collect(Collectors.toList()).forEach(r-> System.out.println(r));
*/
        for (MedicineDto ref:list){
            String[] ref1=ref.getIngredients();
            for (String ref3:ref1){
                System.out.println(ref3);
            }
        }
        System.out.println(" collect company by desc with uppercase================================================================================================================");
        list.stream().sorted((p1,p2)->p2.getCompany().compareToIgnoreCase(p1.getCompany())).map(a->a.getCompany().toUpperCase()).collect(Collectors.toList()).forEach(r-> System.out.println(r));
        System.out.println("Collecting only name with DESC and lower case=====================================================================================");
        list.stream().sorted((p1,p2)->p2.getName().compareToIgnoreCase(p1.getName())).map(a->a.getName().toLowerCase()).collect(Collectors.toList()).forEach(r-> System.out.println(r));
        System.out.println("Collecting elements which is mfd <30====================================================================================================");

        list.stream().filter(p1->p1.getMfd().isBefore(LocalDate.now().plusDays(30))).collect(Collectors.toList()).forEach(r-> System.out.println(r));
        System.out.println("Collecting elements which is mfd >30===========================================================================================");

        list.stream().filter(p1->p1.getMfd().isAfter(LocalDate.now().plusDays(30))).collect(Collectors.toList()).forEach(r-> System.out.println(r));
        System.out.println("Collecting elements which is exp<30===========================================================================================================");
        list.stream().filter(p1->p1.getExpiryDate().isBefore(LocalDate.now().plusDays(30))).collect(Collectors.toList()).forEach(r-> System.out.println(r));



    }
}
