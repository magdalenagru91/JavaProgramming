package day_33_Statics;

public class EmployeeObjects {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 120000;

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
        System.out.println(employee3.salary);
    }

}
