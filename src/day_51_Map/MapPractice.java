package day_51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        //less than 80

        Map<String,Integer> myTeam = new HashMap<>();
        myTeam.put("Magda",85);
        myTeam.put("Farangez",87);
        myTeam.put("Roman",75);
        myTeam.put("Olaf",65);
        myTeam.put("Monica",95);


        for (Integer eachScore : myTeam.values()) {
            if (eachScore<80){
                System.out.println(eachScore);
            }
        }

        for (String eachStudent : myTeam.keySet()) {
            Integer score = myTeam.get(eachStudent);
            if (score<80){
                System.out.println("eachStudent with score less than 80 = " + eachStudent);
            }
        }


        System.out.println("---------------------------------");


        //name of counties and capitals; print all capitals

        Map<String,String > countries = new HashMap<>();
        countries.put("Poland","Warsaw");
        countries.put("Turkey","Ankara");
        countries.put("Spain","Madrid");
        countries.put("USA","Washington DC");



        for (String eachCapital : countries.values()) {
            System.out.println(eachCapital);
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry);
        }

    }
}

