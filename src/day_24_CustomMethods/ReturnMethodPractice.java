package day_24_CustomMethods;

public class ReturnMethodPractice {

    public static void main (String[] args){

        //find the max number between 100 & 200

        int maxNumber = max(100,200);
        System.out.println(maxNumber);


        //multiply the max number by 2

        int multiplication = maxNumber*2;       //you reassign your max to maxNumber and use maxNumber
                                                // in multiplication variable, this is possible only here,
                                                // it would not be able in VOID metod
        System.out.println(multiplication);
    }



    public static int max(int a, int b){
        int result = 0;
        if (a>b){
            result=a;
        } else {
            result=b;
        }

        return result;
    }
}
