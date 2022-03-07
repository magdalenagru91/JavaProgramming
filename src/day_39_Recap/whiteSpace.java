package day_39_Recap;

public class whiteSpace {
    public static void main(String[] args) {
        String s = "Magda Gruszka";

        boolean isWh = containsWhitespace(s);
        System.out.println(isWh);



        char[] ch = s.toCharArray();

        for (char each : ch) {
            if (Character.isSpaceChar(each)){
                System.out.println("char has white space");
                //System.exit(1);
            } else {
                System.out.println("char has NOT white space");
                //System.exit(1);
            }
        }



    }

    public static boolean containsWhitespace(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isWhitespace(s.charAt(i)) && Character.isLetter(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
