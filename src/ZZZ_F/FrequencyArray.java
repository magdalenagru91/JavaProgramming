package ZZZ_F;

public class FrequencyArray {
    public static void main(String[] args) {

        String [] stringArray = {"Farangez", "Magda", "Duygu", "Duygu"};
        String result = "";

        for (String each : stringArray) {
            int count = 0;

            for (String element : stringArray) {
                if (each.equals(element)){
                    count++;
                }
            }
            if (result.contains(each)){
                continue;
            }

            result+=each + " ";
            result+=count + " ";
        }
        System.out.println(result);
    }
}
