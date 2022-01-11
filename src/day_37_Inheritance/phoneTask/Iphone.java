package day_37_Inheritance.phoneTask;

public class Iphone extends Phone {

//Iphone and Phone both have instance variables thats why we need a constructor


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);  //here one value brand can be assign tp all iphones cause all of them belong to apple,
                                                            // thats why we can sent it here, rest is individual for every other
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having a FaceTime with phone number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a FaceTime with phone number " + email);
    }


}

