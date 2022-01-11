package day_31_CustomMethPractice;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);
        System.out.println(person1);

        Person person2 = new Person("Magda", 'F', 30);
        System.out.println(person2);

        person2.age = 31;
        System.out.println(person2);
    }
}
