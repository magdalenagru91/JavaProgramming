package day_21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
        first and last char of each word
         */

        String [] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0)+"" + each.charAt(each.length()-1));
        }
    }
}
