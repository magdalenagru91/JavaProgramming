package day_24_CustomMethods;

public class ReturnMethodsPractice3_UniqueChar {

    //return frequency of one char from the string

    public static void main(String[] args) {
        String str = "aabccdee";

        for (int i = 0; i <str.length(); i++) {     //UNIQUE CHAR

        int frequency = frequency(str, str.charAt(i));

        if (frequency==1){
            System.out.println(str.charAt(i));
        }
    }

    }

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {        //you convert the string to an array of chars (each is char here)
            if (each == ch) {                          //and compare each to ch
                count++;
            }
        }
        return count;
    }


}
