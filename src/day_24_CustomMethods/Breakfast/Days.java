package day_24_CustomMethods.Breakfast;


public class Days {

    /*
     Create a method that can print the name of the day based on the given number to the method
     */

    public static void main(String[] args) {
        NameOfDay(7);
    }

    public static void NameOfDay(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday"
    :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday";
        } else {
            System.out.println("Invalid number");
        }
        System.out.println(name);
    }
}
