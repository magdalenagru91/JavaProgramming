package day_36_Inheritance.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {


        Tester tester1 = new Tester();

        tester1.setInfo("Magda", 'F', 30, 6, "Tester", 80000);
        tester1.testing();
        tester1.work();
        System.out.println(tester1);


        Teacher teacher1 = new Teacher();

        teacher1.setInfo("Erhan", 'M', 30, 7, "Teacher", 40000);
        teacher1.teching();
        teacher1.work();
        System.out.println(teacher1);


        Developer developer1 = new Developer();
        developer1.setInfo("Eray", 'M', 33, 8, "Developer", 120000);
        developer1.coding();
        developer1.work();
        System.out.println(developer1);



        Driver driver1 = new Driver();

        driver1.setInfo("Ola", 'F', 35, 10, "Driver", 80000);
        driver1.driving();
        driver1.work();
        System.out.println(driver1);

    }
}