
package day_07_Operators;

import java.util.*;
public class Hours {

             public static void main(String[] args) {

                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE. inputSeconds is already declared and given
                Scanner userInput = new Scanner(System.in);
                System.out.println("Enter seconds:");
                int inputSeconds = userInput.nextInt();

                // // CONTINUE WRITE YOUR CODE BELOW THIS LINE:


                int hours;
                int minutes;


                int finalHours = inputSeconds/3600;
                int finalMinutes = inputSeconds%3600/60;
                int finalSeconds = inputSeconds%3600%60;






                System.out.println(finalHours + " hours, " + finalMinutes + " minutes, and " + finalSeconds + " seconds");

            }
}
