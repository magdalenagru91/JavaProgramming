package day_39_Recap.AnimalTask;

public class Dog extends FriendlyAnimal {


    public Dog(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    public void bark() {
        System.out.println(getName() + " is barking");
    }


    @Override
    public String toString() {
        return "Friendly Animal Dog{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild() +
                ", isFriendly=" + isFriendly() +
                ", isPlayable=" + isPlayable() +
                '}';
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */


    }
}
