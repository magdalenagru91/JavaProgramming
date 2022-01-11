package day_36_Inheritance.phoneTask;

public class Iphone extends Phone{

    /*
    1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
     */


    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is facetiming with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is facetiming with " + email);
    }



}
