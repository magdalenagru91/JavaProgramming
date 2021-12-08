package day_17_DoWhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            String ch = ""+str.charAt(i);

            if (result.contains(ch)) {
                // break; // exit
                continue; // skip
            }
            result+=ch;

        }
        System.out.println(result);
    }
}
