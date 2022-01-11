package day_33_Statics;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Magda", 30, 'F');


        System.out.println(person1.drink("coke"));
        System.out.println(person1.eat("sushi"));
        person1.sleep();

        System.out.println(person1);
    }
}
