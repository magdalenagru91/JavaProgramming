package day_11_Switch_Scanner.BreakfastPractice;

public class ConvertNumbers0_9_toWords_Ternaries {

    public static void main(String[] args) {

        int num = 10;
        String value = (num==1)? "one" :(num==2)? "two" :(num==3)? "three" :(num==4)? "four" :(num==5)? "five" :(num==6)?
                "six" :(num==7)? "seven" :(num==8)? "eight" :(num==9)? "nine" : "error";
        System.out.println(value);
    }

    }

