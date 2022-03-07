package day_51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score:

        Map<String , Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 85);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",95);
        students.put("Ali",95);
        students.put("Ali",79);

        System.out.println(students);
        System.out.println("students size " + students.size());


        //display the score of Alex:
        System.out.println("score of Alex " + students.get("Alex"));


        //replace Alis score to 90:
        students.replace("Ali",90);
        System.out.println(students);


        //remove method:

        students.remove("Alex");
        System.out.println(students);

        //boolean a1 = students.remove("Ozan",98);
        //System.out.println("a1 " + a1);

        //System.out.println(students.get("Ozan"));

        students.remove("Ozan");
        System.out.println(students);

        boolean a = students.remove("Ozan",98);
        System.out.println("a" + a);


        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);


        boolean r3 = students.containsValue(97);
        System.out.println("r3 " + r3);


        System.out.println(students.isEmpty());


        System.out.println("--------------------------");
        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2);   //false cause they are not the same objects
        System.out.println("map1.equals(map2) = " + map1.equals(map2)); //now true cause they have same values

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);





    }



}
