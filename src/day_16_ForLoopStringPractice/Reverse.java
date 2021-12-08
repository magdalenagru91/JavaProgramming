package day_16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        /*
        Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */

        String str = "Wooden Spoon";
                  //  0123456...
        String result = "";


                                                        // str.charAt(str.length()-1); //n-last char

        for (int i=str.length() - 1; i>=0; i--) {       //i:the index numbers of str starting last index to index 0

            //result += str.charAt(str.length() - 1);
            result += str.charAt(i);                    //adding each character to result
        }



        System.out.println(result);

        /*

        result += str.charAt(11); n
        result += str.charAt(10); o
        result += str.charAt(9);  o
        result += str.charAt(8);  p
        result += str.charAt(7);  S
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);
                  */
    }
}



