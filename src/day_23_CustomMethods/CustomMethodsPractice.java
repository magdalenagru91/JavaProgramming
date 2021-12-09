package day_23_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        System.out.println("Test start:");
        helloWorld5Times();
        System.out.println("Test finished");
    }

    //create a function that can print hello 5 times ==> helloWorld5Times()

    public static void helloWorld5Times(){

        String word = "Hello World";

        for (int i = 0; i < 5; i++) {
            System.out.println(word);

        }
    }



    //create a function that can print hello Cydeo 5 times ==> helloCydeo5Times()
}
