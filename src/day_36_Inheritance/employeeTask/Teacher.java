package day_36_Inheritance.employeeTask;

public class Teacher extends Employee{
    /*
    2.4 Create the sub class of Employee named Teacher:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				teaching
				toString()
     */

    public void teching(){
        System.out.println(name + " " + jobTitle + " is teaching");
    }
}
