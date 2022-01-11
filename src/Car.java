public class Car {

    /*
    class name: Car
         instance variables:
                 make, model, year, price, color
         1st constructor: initializes the make ONLY
         2nd constructor: initializes make & model
                 (MUST use constructor call to set the make)
        3rd constructor: initializes make, model, year
                (MUST use constructor call to set the make, model)
        4th constructor: initializes make, model, year, price
                (MUST use constructor call to set the make, model, year)
        5th Constructor: intializes all the instances
                (MUST use constructor call to set the make, mode, year, price, color)
        instance methods: toString
     */

    public String brand, model;
    public int year;
    public double price;
    public String color;


    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, String model){
        this(brand);
        this.model=model;
    }

    public Car(String brand, String model, int year){
        this(brand,model);
        this.year=year;
    }

    public Car(String brand, String model, int year, double price){
        this(brand,model,year);
        this.price=price;
    }

    public Car(String brand, String model, int year, double price, String color){
        this(brand,model,year,price);
        this.color=color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}


class CarObjects{
    public static void main(String[] args) {
        day_32_Constructors.Car car1 = new day_32_Constructors.Car("Toyota");
        day_32_Constructors.Car car2 = new day_32_Constructors.Car("Honda", "Accord");
        day_32_Constructors.Car car3 = new day_32_Constructors.Car("Lexus", "RX350", 2021);
        day_32_Constructors.Car car4 = new day_32_Constructors.Car("BMW", "X6", 2020, 50000);
        day_32_Constructors.Car car5 = new day_32_Constructors.Car("Tesla", "Model 3", 2019, 70000, "black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }

}
