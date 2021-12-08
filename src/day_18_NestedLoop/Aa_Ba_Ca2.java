package day_18_NestedLoop;

public class Aa_Ba_Ca2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                System.out.print("" + i + j + " ");
                if (j == 'z') {
                    System.out.println("");
                }
            }
        }
    }
}
