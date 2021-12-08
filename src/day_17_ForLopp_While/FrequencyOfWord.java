package day_17_ForLopp_While;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJava";
        int frequency = 0;

                                //8    - 3 = 5 ==> so range from 0 to 4 because it is i<5 (which is 4)
        for (int i = 0; i < str.length()-3; i++) {  // i<= str.length()-4;
            String eachSub = str.substring(i,i+4);
            //System.out.println(eachSub);

            if (eachSub.equals("Java")) {
                frequency++;
            }


        }
        System.out.println(frequency);

    }
}
