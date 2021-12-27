package day_30_CustomClass;

import java.util.IllegalFormatCodePointException;

public class CapitalOne_Employee {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("Magda", "2512", 'F', "SDET", 100000, employee1.isFullTime);

        Employee employee2 = new Employee();
        employee2.setInfo("Eray", "2562", 'M', "HR", 95000, !employee1.isFullTime);

        Employee employee3 = new Employee();
        employee3.setInfo("Helena", "1456", 'F', "AR", 56000, employee1.isFullTime);

        Employee employee4 = new Employee();
        employee4.setInfo("Maria", "3214", 'F', "AP", 8000, employee1.isFullTime);

        Employee employee5 = new Employee();
        employee5.setInfo("Stan", "9632", 'M', "MARKETING", 90000, !employee1.isFullTime);


        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                System.out.println(employee);
                countFullTime++;
            } else {
                countPartTime++;
            }

            if (employee.salary>max){
                max = employee.salary;
            }

            if (employee.salary<min){
                min = employee.salary;
            }
        }
        System.out.println("how many is full time: " + countFullTime);
        System.out.println("how many is part time: " + countPartTime);
        System.out.println("max salary: " + max);
        System.out.println("min salary: " + min);






        System.out.println("--------------------------my way--------------------------------");

        double minSalary = employee1.salary;

        for (Employee employee : employees) {
            if (employee.salary<minSalary){
                minSalary=employee.salary;
            }
        }
        System.out.println(minSalary);


        double maxSalary = employee1.salary;

        for (Employee employee : employees) {
        if (employee.salary>maxSalary){
            maxSalary=employee.salary;
        }
        }
        System.out.println(maxSalary);
}
}
