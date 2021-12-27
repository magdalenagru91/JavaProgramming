package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();




        //ADDS

        numbers.add(10);    //0
        numbers.add(20);    //1
        numbers.add(30);    //2
        numbers.add(40);    //3
        numbers.add(50);    //4

        System.out.println(numbers);

        numbers.add(2,25);
        System.out.println(numbers);

        numbers.add(5,45);
        System.out.println(numbers);




        //SIZE

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println("last index: " + lastIndex);




        //GET

        System.out.println("---------------------");

        int num = numbers.get(3);
        System.out.println(num);




        //SET - REPLACING, IT DOES NOT CHANGE THE SIZE OF ARRAY

        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("java");
        list.add("c#");
        list.add("Ruby");

        list.set(2,"JavaScript");
        System.out.println(list);
    }


}
