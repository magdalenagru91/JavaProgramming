package day_43_Abstraction.employeeTask;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " teacher is sleeping 10 hours");
    }

    @Override
    public void work() {
        System.out.println(getName() + " teacher is teaching");
    }
}
