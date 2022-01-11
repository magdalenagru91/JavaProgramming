package day_33_Statics;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("husky", "small", "white", 'F', 5);

        Dog dog2 = new Dog("terier", "big");

        dog2.eat();

        System.out.println(dog2);

    }
}
