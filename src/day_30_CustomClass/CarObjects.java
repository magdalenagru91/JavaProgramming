package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {


    public static void main(String[] args) {

        Car car1 = new Car();       //Car - data type; new Car - object of the car
        car1.setInfo("Honda", "Accord", "Blue", 2011, 14999.99);


        Car car2 = new Car();
        car2.setInfo("Toyota", "Corolla", "White", 2019, 20000.55);


        Car car3 = new Car();
        car3.setInfo("Nissan", "Altima", "Black", 2007, 13000.88);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


       // Car[] cars = {car1,car2,car3};     you cannot remove or add more cars in array
        // it is better to create an ArrayList


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(carsList);


        /*
        print brand and price
         */

        for (Car each : carsList) {
            System.out.println( each.brand + " " + each.price );
        }


        System.out.println("------------------------------------------");

        /*
        recall bmw 2005-2008
        nissan 2005-2008
         */

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf( p -> p.brand.equals("Nissan") && p.year >= 2005 && p.year <= 2008);

        System.out.println(carsList);

    }

}
