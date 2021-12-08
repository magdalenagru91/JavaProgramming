package day_14_String;

public class StringMethods1_LastIndexOf {   // finds the number of your character from the RIGHT

    public static void main(String[] args) {

        String str1 = "Java Programming language";

        int n1 = str1.lastIndexOf("g");
        System.out.println(n1);

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int forthA = s.indexOf("ava W");

        int forthA2 = s.indexOf("Ca") + 1;  // without +1 would be C, with +1 it is a

        int fifthA = s.lastIndexOf("va") +1; // without +1 would be v, with +1 it is a

        int forthAFromRight = s.lastIndexOf("av");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("first A = " + firstA);
        System.out.println("last A = " + lastA);
        System.out.println("second A = " + secondA);
        System.out.println("forth A =" + forthA);
        System.out.println("forth A =" + forthAFromRight);
        System.out.println("forth A 2 =" + forthA2);
        System.out.println("sixth A = " + sixthA);
        System.out.println("seventh A = " + seventhA);
        System.out.println("fifth A +1 = " + fifthA);
    }
}
