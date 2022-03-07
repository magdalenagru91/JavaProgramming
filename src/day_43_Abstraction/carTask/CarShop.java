package day_43_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        // Car car1 = new Car("Cydeo","25","blue",2022,1000);
        //we cannot create an object from abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "blue", 2011, 10000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------------");

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
