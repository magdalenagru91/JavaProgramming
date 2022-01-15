package day_39_Recap.AnimalTask;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }

    public void scratch(){
        System.out.println(getBreed() + " " + getName() + " is scratching");
    }

    public void meow(){
        System.out.println(getBreed() + " " + getName() + " is meowing");
    }






    /*
    2. Cat:
					Extra methods:
						scratch()
						meow()
     */
}
