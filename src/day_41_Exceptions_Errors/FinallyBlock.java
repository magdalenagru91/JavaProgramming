package day_41_Exceptions_Errors;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};


        try{
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch(RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            //System.err.println(0);    //this is the only way not to run FINALLY
        }finally {
            System.out.println("Finally block");

        }
        }

}
