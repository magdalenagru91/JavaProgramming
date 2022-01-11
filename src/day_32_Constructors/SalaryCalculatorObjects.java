package day_32_Constructors;

public class SalaryCalculatorObjects {

    public static void main(String[] args) {


        SalaryCalculator salCal1 = new SalaryCalculator(20,0.06,.11,40);

        System.out.println(salCal1);

        salCal1.salary();
        salCal1.federalTax();
        salCal1.stateTax();
        salCal1.salaryAfterTax();

        System.out.println(salCal1);
    }
}
