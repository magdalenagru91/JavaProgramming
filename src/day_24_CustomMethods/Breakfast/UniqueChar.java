package day_24_CustomMethods.Breakfast;

public class UniqueChar {
    /*
    create a method that can display the unique characters of a string
     */

    public static void main(String[] args) {
        UniqueCharacter("Magda");
    }

    public static void UniqueCharacter(String word) {

        String result = "";

        for (int j = 0; j <word.length(); j++) {
            char each = word.charAt(j);
            int frequency = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch==each){
                    frequency++;
                }

                }

            if (frequency==1){
                result+=each + " ";
            }
            if (result.contains(""+each)){
                continue;
            }

        }
        System.out.println("The unique chars are: " + result);
    }
}