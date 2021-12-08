package day_20_Arrays;

public class MinumumNumber {
    public static void main(String[] args) {
        
        int [] numbers = {5,9,3,1};
        
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]<min) {
                min = numbers[i];
            }
            
        }
        System.out.println(min);
    }
}
