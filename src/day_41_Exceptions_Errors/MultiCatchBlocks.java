package day_41_Exceptions_Errors;

import day_30_CustomClass.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


        Employee employee = null;

        try {
            System.out.println(employee.salary);
        } catch (IndexOutOfBoundsException r) {
            System.out.println("First catch block");
            r.printStackTrace();
        } catch (ArithmeticException r) {
            System.out.println("Second catch block");
            r.printStackTrace();
        } catch (ClassCastException r) {
            System.out.println("Third catch block");
            r.printStackTrace();
        }catch(RuntimeException r){
            System.out.println("Fourth catch block");
            r.printStackTrace();
        }
    }
}
