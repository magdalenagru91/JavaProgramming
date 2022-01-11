package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    /*
     write a program that can swap the first and last elements of an ArrayList of Integers
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);


        //int[] arr = {1,2,3,4,5,6,7,8};
        //System.out.println(Arrays.toString(arr));


        System.out.println("-----------------------------------------");

        /*
        Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
         */


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();
        System.out.println(size);   //old size with zeros


        list.removeAll( Arrays.asList(0) );     //remove all the zeros - it makes list a "new list" without zeros
        System.out.println(list);


        int newSize = list.size();
        System.out.println(newSize);        //new size without zeros


        int totalNumberOfZeros = size-newSize;      //how many zeros do I have?
        System.out.println(totalNumberOfZeros);


        for (int i = 0; i < totalNumberOfZeros; i++) {      //here you add the zeros to your list (that was before shortened by 0)
            list.add(0);
        }

        System.out.println(list);

/*
removeIf number = zero - remove
we could use it
but it is better to use removeIf for unknown numbers
if we know the numbers - use removeAll
 */


        System.out.println("----------------------different way zeros to the end-------------------");
/*
1.you do 2 for loops - first to pass numbers that are not zeros
2.second one - you pass numbers that are zeros
 */
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println(result);

        /*
        Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
         */


        /*
        1.you add all characters
        2.remove if char is not letter
        3.remove if char is not digit
        4.remove letter and digit
         */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            chars.add( str.charAt(i) );
        }

        ArrayList<Character> letters = new ArrayList<>(chars);      //add all the characters from chars arrayList to letters arrayList
        System.out.println("chars = " + letters);


        letters.removeIf( p -> !Character.isLetter(p) );     //remove the character that are not letters
        System.out.println("Letters = " + letters);


        ArrayList<Character> digits = new ArrayList<>(chars);   //add all the characters from chars arrayList to digits arrayList
        System.out.println("digits = " + digits);


        digits.removeIf( p -> !Character.isDigit(p) );      //remove the character that are not digits
        System.out.println("Digit = " + digits);


        ArrayList<Character> specialChar = new ArrayList<>(chars);

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("Special characters = " + specialChar);






    }
}
