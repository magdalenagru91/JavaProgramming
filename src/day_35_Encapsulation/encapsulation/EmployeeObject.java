package day_35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', -28, -110000);

        employee1.setAge(32);



        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);    //salary is instance,each object has separate data

        employee2.setName("Hulya");
        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println("employee1 age: " + employee1.getAge());


        System.out.println(employee1);
        System.out.println(employee2);

    }

}

