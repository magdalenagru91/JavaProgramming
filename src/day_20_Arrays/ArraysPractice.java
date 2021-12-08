package day_20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        /*
        store the elements: 10,20,50,70
         */

        int [] elements = {10,20,50,70};

        System.out.println(Arrays.toString(elements));

        int num = 1;

        System.out.println(elements[num=1-1]);


        System.out.println("---------------------------");

        /*
        create a variable that can contain 5 scores
         */

        int [] score = new int[5];

        System.out.println(Arrays.toString(score));

        score[1] = 85;
        score[score.length-1]=95;
        score[3] = 75;
        score[0] = 65;
        score[2]=55;

        System.out.println(Arrays.toString(score));



        System.out.println("---------------------------");

        String [] months= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
/*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
*/


        for (int i = 0; i < months.length; i++) {   //i: represents index numbers of this array starting from 0
            System.out.println(months[i]);

        }

        System.out.println();

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);

        }




    }
}
