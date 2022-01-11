package day_35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {


        Person p1 = new Person();
        //p1.name = "Daniel; -> NO!!! cause variable is privet
        //p1.age = 28; -> NO!!! cause variable is privet

        p1.setName("Daniel");
        p1.setAge(45);

        //System.out.println(p1.name + " : " + p1.age); -> NO!!! cause variable name and age is privet

        System.out.println(p1.getName() + " : " + p1.getAge());
    }
}
