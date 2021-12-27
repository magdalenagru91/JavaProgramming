package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        //ADD METHOD - ADDS MULTIPLE ELEMENTS TO THE ARRAY LIST - to pass as collection

        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,5,5,6,7));
        System.out.println(list);





        //REMOVE METHOD - REMOVES ALL ELEMENTS FROM THE ARRAY LIST

        list.removeAll(Arrays.asList(3,5,8));       //you specify the element, not index
        System.out.println(list);





        //RETAIN METHOD - WILL RETAIN ELEMENTS YOU WANT TO KEEP - oposite to remove all

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);


        System.out.println("-------------------------------------");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET"));
        jobTitles.retainAll(Arrays.asList("QA"));
        System.out.println(jobTitles);


        System.out.println("-------------------------------------");



        //CONTAINS / CONTAINS ALL

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.containsAll(Arrays.asList(1,2,3));

        boolean r3 = nums.contains(2) && nums.contains(5);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);



        System.out.println("-------------------------------------");


        // WE CAN PASS ARRAY TO () (after the new...) AS LIST TO OUT ARRAYLIST

        String[] names = {"Josh", "Jack", "Daniel", "Shay"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        /*
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);
        */


        System.out.println("-------------------------------------");

        // this will NOT work :     int[] arr = {1,2,3,4,5,6,7,8,9,10}; cause it is PRIMITIVE

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};         // YOU NEED WRAPPER, NOT PRIMITIVE!

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);




        System.out.println("-------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println(list3);



    }


//method to convert array to arrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
