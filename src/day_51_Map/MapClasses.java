package day_51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer , String> hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        hashMap.put(null,"Emre");
        hashMap.put(null,"Hulya");
        hashMap.put(6,null);
        hashMap.put(7,null);

        System.out.println("hashMap = " + hashMap);


        Map<Integer , String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Emre");
        linkedHashMap.put(null,"Hulya");
        linkedHashMap.put(6,null);
        linkedHashMap.put(7,null);

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer , String> treeMap = new TreeMap<>();

        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Isabella");
        //treeMap.put(null,"Emre"); you cannot have null key in treeMap - same as TreeSet
        //treeMap.put(null,"Hulya"); you cannot have null key in treeMap - same as TreeSet
        treeMap.put(6,null);
        treeMap.put(7,null);

        System.out.println("treeMap = " + treeMap);


        Map<Integer , String> hashTable = new Hashtable<>();

        hashTable.put(10,"Arthur");
        hashTable.put(20,"George");
        hashTable.put(3,"Jack");
        hashTable.put(40,"Emma");
        hashTable.put(5,"Isabella");
        //hashTable.put(null,"Emre"); //you cannot have null key in treeMap - same as TreeSet
        //hashTable.put(null,"Hulya"); //you cannot have null key in treeMap - same as TreeSet
        //hashTable.put(6,null);
        //hashTable.put(7,null);

        System.out.println("hashTable = " + hashTable);


    }
}
