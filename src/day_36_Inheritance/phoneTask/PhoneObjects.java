package day_36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();

        iphone1.setInfo("Iphone", "10", "small", 1000, "white");

        iphone1.faceTime("magda@op.pl");
        iphone1.call(6033870655L);

        System.out.println(iphone1);



        System.out.println("---------------------------------------");


        Samsung samsung1 = new Samsung();

        samsung1.setInfo("Samsung", "Galaxy", "small", 500, "black");

        samsung1.freeze();

        System.out.println(samsung1);



        System.out.println("---------------------------------------");


        Nokia nokia1 = new Nokia();

        nokia1.setInfo("Nokia", "910", "big", 350, "blue");

        nokia1.selfDefense();

        System.out.println(nokia1);
    }
}
