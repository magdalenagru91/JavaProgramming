package zzz_INTERVIEW;

public class FrequencyOfWordArrayStringFarangez {

    public static void main(String[] args) {

            String[] sentence = {"java", "java", "python"};
            String result = "";

        for (String each : sentence) {
            int count = 0;

            for (String element : sentence) {
                if (each==element){
                    count++;
                }
                }
            if (result.contains(each)){
                continue;
            }

            result+=each;
            result+=count;
        }
        System.out.println(result);

    }
}
