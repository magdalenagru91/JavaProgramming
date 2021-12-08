package day_21_ForEachLoop;

public class Reverse {
    public static void main(String[] args) {


        String[] name = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles"};


        for (String each : name) {          //each name from the array, it will put the name to the inner loop

           String reversed = "";            ////this makes my reverse empty every time the loop runs

            for (int i = each.length()-1; i >=0; i--) {     //one name by one
                reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }

    }
}