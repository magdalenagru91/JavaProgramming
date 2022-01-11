package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);


        System.out.println(list);
        int num = 1;
        list.remove(num);
        System.out.println("elo " + list);

        Integer num1 = 200;             //this is not primitive, it is wrapper, so here OBJECT (200) WILL BE REMOVED
        boolean r = list.remove(num1);       //when you pass primitive int it removes the parameter at that index
                                            //if the object 200 was removed successfully this boolean will be true,
                                            //if this element was not removed = boolean is false
        System.out.println(list);
        System.out.println(r);


        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

        System.out.println(list);


        System.out.println("---------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);



        System.out.println("----------------------------------");


        boolean r2 = characters.contains('A');
        System.out.println(r2);

        boolean r3 = characters.contains('B');
        System.out.println(r3);



        System.out.println("----------------------------------");


        //EQUALS

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);     //it is false cause they are 2 different objects - starts with NEW, they are not same objects

        System.out.println("equals? " + list1.equals(list2));        //here we compare the elements, it is true, equals - same elements in same order




        System.out.println("----------------------------------");


        //ISEMPTY

        boolean r4 = list1.isEmpty(); //false
        System.out.println("r4 = " + r4);



        System.out.println("----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));       //we dont have to add one by one like we did at the beginning,
                                                            // it adds a lot of elements at the same time
        System.out.println(numbers);



        System.out.println("----------------------------------");
        ArrayList<Integer> u = new ArrayList<>();
        Integer [] t = {1,2};
        ArrayList<Integer> u1 = new ArrayList<>(Arrays.asList(t));

        System.out.println(u1);

        u.addAll(u1);

        System.out.println(u);

    }
}
