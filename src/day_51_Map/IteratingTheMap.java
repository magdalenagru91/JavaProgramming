package day_51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();
        students.put("Aygun",95);
        students.put("Maria",90);
        students.put("Ali",85);
        students.put("Alex",99);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);


        System.out.println(students);

        Map<String,Integer> earlyBirds = new HashMap<>(); //score>=90
        Map<String,Integer> angryBirds = new HashMap<>(); //score<90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value>=90){
                earlyBirds.put(key,value);
            }else {
                angryBirds.put(key,value);
            }
        }
        System.out.println("early birds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);



        Set <String> names = students.keySet();
        System.out.println("names = " + names);


        //remove all the students whose score is less than 90:

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if (eachValue<90){
                System.out.println(eachKey);
            }
        }


        System.out.println("--------------------------------------");

        //Collection<Integer> scores = students.values();
        //System.out.println("scores = " + scores);

        List<Integer>scores = new ArrayList<>(students.values());
        System.out.println(scores);


        for (Integer value : students.values()) {
            System.out.println(value);
        }


        System.out.println("--------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score>maxScore){
                maxScore=score;
            }
            if (score<minScore){
                minScore=score;
            }

        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);


        System.out.println("--------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("-------------------------");


        //how many strudents got 95 or more


        int count = 0;

/*  THIS IS A BETTER SOLUTION:

        for (Integer eachScore : students.values()) {
            if (eachScore>=95){
                count++;
            }
        }

        System.out.println("count = " + count);


 */

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);

            if (eachScore>=95){
                count++;
            }
        }
        System.out.println(count);



        System.out.println("-------------------------");

        //Entry is an innter iterface of Map:

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            //System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
