package day_37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String [] args) {
        Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "small", "black");

        System.out.println(dog1);
        dog1.bark();
        //dog1.scratch;
        //dog1.sing();



        Cat cat1 = new Cat("Lola", "Siamese", 'F', 2, "large", "white");

        System.out.println(cat1);
        cat1.scratch();
        //cat1.bark();
        //cat1.sing();



        Parrott parrott1 = new Parrott("King", "Macaw", 'M', 3, "Small", "blue", "red");

        System.out.println(parrott1);
        parrott1.sing();
        //parrott1.bark();
        //parrott1.scratch();


    }
}
