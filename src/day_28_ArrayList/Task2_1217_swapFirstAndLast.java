package day_28_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2_1217_swapFirstAndLast {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.addAll(Arrays.asList(1,2,3,4,5));


        numbers.set(0, numbers.size()); //the second value is Integer thats why it is numbers.size() and not numbers.size()-1
        numbers.set(numbers.size()-1, 0);

        System.out.println(numbers);
        System.out.println(numbers.size());





    }
}
