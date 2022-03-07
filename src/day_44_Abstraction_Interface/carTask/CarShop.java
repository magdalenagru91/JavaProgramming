package day_44_Abstraction_Interface.carTask;

public class CarShop {
    public static void main(String[] args) {

        Audi audi = new Audi("X5",2015,60000,"white");
        BMW bmw = new BMW("elo",2016,55000,"red");
        CydeoCar cydeoCar = new CydeoCar("awesome",2020, 200000,"blue");
        Honda honda = new Honda("Accord", 2012, 12000, "navy");
        Mercedes mercedes = new Mercedes("Benz", 2019, 40000, "pink");
        Nio nio = new Nio("ggg", 2021, 80000,"silver");
        Tesla tesla = new Tesla("3", 2021, 85000, "black");
        Toyota toyota = new Toyota("corolla",2014,15000,"grey");

        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();

        System.out.println(bmw);
        bmw.start();
        bmw.stop();
        bmw.drive();

        System.out.println(cydeoCar);
        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.stop();

        System.out.println(honda);
        honda.drive();

        System.out.println(mercedes);
        mercedes.autoPark();
        mercedes.stop();

        System.out.println(nio);
        nio.selfDrive();

        System.out.println(tesla);
        tesla.selfDrive();
        tesla.autoPark();
        tesla.stop();

        System.out.println(toyota);
        toyota.drive();
        toyota.stop();
    }
}
