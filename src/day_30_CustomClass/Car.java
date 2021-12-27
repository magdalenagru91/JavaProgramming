package day_30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }

    public void start() {
        System.out.println("Starting " + brand + " " + model);
    }

    public void stop() {
        System.out.println("Stopping " + brand + " " + model);
    }



    // to be able to print it you have to use toString method:
    //right click and choose generate -> toString
    //uncheck insert Override

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }


    //set the info by setInfo method - it lets you enter the data easier to call it
    //enter the data you wanted to display
    //and assign it to the proper data you set at the beginning
    //in order to set the elements you assign the arguments one by one

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }
}
