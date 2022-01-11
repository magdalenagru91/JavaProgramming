package day_36_Inheritance.employeeTask;

public class Employee {

    /*
    2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()
     */


    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void work(){
        System.out.println(name + " " + jobTitle + " is working for " + salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
