package day_53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReverseList {

    public static void main(String[] args) {

        Function<List<Integer>, List<Integer>> reverseList = (a) -> {

            List<Integer> reverse = new ArrayList<>();
            for (int i = a.size()-1; i >=0 ; i--) {
                reverse.add(a.get(i));
            }
            return reverse;
        };

        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseList.apply(arr));
    }
}
