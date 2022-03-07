package day_44_Abstraction_Interface.animalTask;

class Test{
    public static void main(String[] args) {
        System.out.println(new Test().getClass().getSimpleName());
    }
}


public abstract class Animal {


    //this class cannot create objects
    //this class can have final methods still, or variables, thats ok

    private String name;
    private final String breed; //you cannot change the breed of an animal thats why FINAL
                                //one copy for all the objects - static
                                //multiple copies - instance
    private final char gender;
    private int age;
    private String size;
    private final String color;
    public final static boolean canBreath;
    //static makes sure this has only one copy, but it doesnt mean this value cannot be changed,
    //you can still reassign it; thats why you need final
    //final - not related to static/instance; it indicates that whatever is final it is unchangable
    //static and instance can be final


    static {
        canBreath = true;
        }


    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;

        //do it before gender to check it first
        if (!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }

        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }


    //setters - only 3, cause finals cannot have setters

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }


    //static or not? it depends if method needs to use any of the variables
    public final void drink(){
        System.out.println(name + " is drinking");
    }


    //this method cannot be final, cause abstract is meant to be overriden and final prevents it
    public abstract void eat();


    public String toString() {

        //this getClass.getSimpleName method lets us pass names of a particular class instead of
        //traditional "Animal":

        return getClass().getSimpleName()+"{"+

                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
