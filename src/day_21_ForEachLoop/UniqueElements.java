package day_21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Olga"};

        for (String each : words) {     //takes each word to put into the inner loop
            int count = 0;
            for (String element : words) {  //checks an element and compares to the rest of them
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
