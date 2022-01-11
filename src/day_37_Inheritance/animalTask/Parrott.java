package day_37_Inheritance.animalTask;

public class Parrott extends Animal{

    public String parrotWingColor;


    public Parrott(String name, String breed, char gender, int age, String size, String color, String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
