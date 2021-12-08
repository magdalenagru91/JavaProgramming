package day_12_Scanner;

import java.nio.file.LinkPermission;
import java.util.Scanner;       //wild import: import.java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        it is better to have a SCANNER VARIABLE - here "scan", not scanner every time like:   time 10:57
        new Scanner
        new Scanner

         */


        System.out.println("Enter a number between 1 to 7: ");

        int num = scan.nextInt();


        String result = " ";        //temporary value, you dont have to assing " "
                                    //if you are sure!!! that it will be exectuted,
                                    //but better to put it " "!

        if (num>=1 && num <=7) {

          result = (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday"
                   :(num==5)? "Friday" :(num==6)? "Saturday" : "Sunday";

        }else{
            result="Invalid";

        }

        System.out.println(result);

        scan.close();





    }
}
