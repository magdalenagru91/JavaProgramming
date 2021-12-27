package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3_namesStartWithNoM {
    public static void main(String[] args) {

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};



        //converts array to arrayList: Arrays.asList()
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf( p -> p.charAt(0) == 'M' );        //or use startsWith method

        //System.out.println(list);


        names = list.toArray(new String[0]);    //to convert list to array you take toArray method,
                                                // then specify type of array - new String - and 0 for size

        System.out.println(Arrays.toString(names));

    }
}
