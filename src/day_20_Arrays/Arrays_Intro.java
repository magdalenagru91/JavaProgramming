package day_20_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.rmi.ServerError;
import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];       //it can have 5 elements now, YOU WILL ONLY USE IT IF YOU KNOW THE NUMBER OF ELEMENTS
                                                                                            // BUT YOU DONT KNOW WHAT THE ELEMENTS ARE

        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Hulya";
        myGroup[3]="Mikael";
        myGroup[4]="Suat";

        //System.out.println(myGroup);    //hashcode-> wrong way to print the array

        System.out.println(Arrays.toString(myGroup));         //imports java.util.Array class
        System.out.println(myGroup[1]);


        System.out.println("------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                            //0         1           2           3           4           5           6
        //you can enter your data right away in curly braces, if you enter the size like above (5), you have to enlist them separately one by one

        System.out.println(Arrays.toString(days));


        int number = 1;

        if (number<1 || number>7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);     //WILL RETURN FRIDAY, THEY PROVIDED 5, SO 5-1=4, INDEX 4 IS FRIDAY




        System.out.println("------------------------");

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        number = 12;

        if (number<1 || number>12) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(months[number-1]);








    }
}
