package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2_Employees {

    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);





    }
}
