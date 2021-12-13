package day_24_CustomMethods;

public class ReturnMethodsPractice4_RemoveDuplicates {

    /*
     create a method that can remove duplicated characters from a string and returns the new value
     */
    public static void main(String[] args) {
        String str = "ccccccccccddddddddddddaaaaaaaaaaabbbbbbb";

        String removedDuplicates = removeDuplicates(str);           //I am assigning it to a new variable
        System.out.println(removedDuplicates);
    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(each+"")){
                result+=each;
            }
        }
        return result;
    }
}
