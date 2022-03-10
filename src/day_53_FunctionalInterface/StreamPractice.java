package day_53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        //distint method - to remove duplicates

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect(Collectors.toList());
        //[1,2,3,4,5,6]
        //.collect(Collectors.toList()) - tp go back to list, and yuo can reassign it to list1

        System.out.println(list1);


        System.out.println("--------------------------------------------------------------------");

        int[]arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        //.toArray() - to go back to array, and you can reassign it to arr1

        System.out.println(Arrays.toString(arr1));


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);


        System.out.println("--------------------------------------------------------------------");

        int[]arr2 = {1,2,3,4,5,6,7,8,9,10};
        arr2 = Arrays.stream(arr2).skip(4).toArray();

        System.out.println(Arrays.toString(arr2));


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println("list3= " + list3);




        System.out.println("--------------------------------------------------------------------");

        int[]arr3 = {1,2,3,4,5,6,7,8,9,10};
        arr3 = Arrays.stream(arr3).limit(7).toArray();

        System.out.println(Arrays.toString(arr3));


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("list4 = " + list4);
        list4 = list4.stream().map( p-> p*10 ).collect(Collectors.toList());
        System.out.println("list4 = " + list4);


        System.out.println("--------------------------------------------------------------------");

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        System.out.println("days = " + days);
        days = days.stream().map( p -> p.substring(0,3)).collect(Collectors.toList());
        System.out.println("days = " + days);


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evenNumbers = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println("evenNumbers = " + evenNumbers);


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        long count = list6.stream().filter( p -> p%2 !=0).count();
        System.out.println("count = " + count);


        System.out.println("--------------------------------------------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long javaCount = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        System.out.println("javaCount = " + javaCount);

        //to display all java that are matching
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p) );


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1 = list7.stream().allMatch( p -> p%2==0);
        System.out.println("r1 = " + r1);


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list8 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,22));
        boolean r2 = list8.stream().anyMatch( p -> p>20);
        System.out.println("r2 = " + r2);


        System.out.println("--------------------------------------------------------------------");

        List<Integer> list9 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,22));
        boolean r3 = list9.stream().noneMatch( p -> p%50==0);
        System.out.println("r3 = " + r3);
    }
}
