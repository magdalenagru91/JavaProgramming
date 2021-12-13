package day_24_CustomMethods;

public class ReturnStatement2_nameOfMonth {

     /*
    Create a method that can display the name of the month based on the given number to the method
     */

    public static void main(String[] args) {

        nameOfMonth(6);
    }


    public static void nameOfMonth(int number){



        if (number<1 && number > 12) {
            System.out.println("Invalid");
            return;                         //we can exit the statement by using return
        }

            String name = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Apr" :(number==5)? "May"
                    :(number==6)? "Jun" :(number==7)? "Jul" :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct"
                    :(number==11)? "Nov" : "Dec";

            System.out.println(name);
        }

    }

