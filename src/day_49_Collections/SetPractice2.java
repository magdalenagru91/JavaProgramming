package day_49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon",
                "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String [0]);
        //(Arrays.asList(arr)) cause you need to add to HashSet the arrayList not array;
        //toArray(new String [0]); to make it back to the array - without this part arr couldnt be a reference to the hashset object


        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); //-> to insert the arr array to the set you pass it
                                                                // as a collection type (array list) to the constructor of the hashset

        set1.toArray(new String[0]);    //->toArray method converts the set to array

        System.out.println(set1);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.asList(set1));




        System.out.println("---------------------------");


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,40,30,20,10));


        list = new ArrayList<>( new LinkedHashSet<>(list) );

        //list = new ArrayList<>(new LinkedHashSet<>(list));      //you convert ArrayList to hashSet this way

        //System.out.println(list);

        System.out.println("list = " + list);


        System.out.println("---------------------------------");


        String [] array = {"A", "A", "B", "C"};

        List<String> s = new ArrayList<>(Arrays.asList(array));
        s.addAll(Arrays.asList(array));

        s.addAll(Arrays.asList("E", "F", "G"));

        s.toArray( new String [0] );
        System.out.println("s array= " + s);


        System.out.println("---------------------------------");

        /*
        return fifth element after removing the duplicates do not change the order of the elements:
         */

        Integer[]nums = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println("set2 = " + set2);

        ArrayList<Integer> array2 = new ArrayList<>(set2);

        System.out.println("array2.get(4) = " + array2.get(4));


/*
        nums= new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        //without toArray it coudnt exist = array cannot be a reference to linkedHashSet - there is no relationship here between them; you need toArray method
        //toArray is overloaded method

        //nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        //1.you add into the constructor of LinkedHashSet the collection: Arrays.asList(nums)
        //2.to assign it back to nums you need to convert it to Array by adding .toArray(new Integer[0]);
        //- you need to pass Integer array object (new Integer[0]) - minimum length is always zero, that's why zero, don't put maximum length
        //or otherwise you will get null;
        //best thing to do is to give 0 number, cause if the length is grater it will just change for bigger length

        System.out.println(Arrays.toString(nums));

        System.out.println("Fifth element: " + nums[4]);

*/


        System.out.println("---------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = ""; //e5a4b4c4d3e5


        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")) , each);
                                            //collection type - here arrayList , each
            result+=each + count;
        }

        System.out.println(result);

        //0.Convert string to array by str.split("");
        //1.you convert array to arrayList by Arrays.asList
        //2.you convert string to array by str.split("")
        //3.you do for loop


        System.out.println("---------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println( names.toArray(new String[0])[2] );
        //converting names (set) to Array - set does not have index numbers - array does

        System.out.println( new ArrayList<>(names).get(4)  );
        //converting names (set) to ArrayList - set does not have index numbers - ArrayList does

        for(String each : names ){
            System.out.println(each);
        }


    }
}
