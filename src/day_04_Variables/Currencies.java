package day_04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1;
        double lira = 9.52;
        double euro = 0.86;
        double jpy = 114.14;

        System.out.println("$1000.00 dollars is "+ dollar*1000*lira + " lira.");
        System.out.println("$1000.00 dollars is " + dollar*1000*euro + " euro.");
        System.out.println("$1000.00 dollars is " + dollar*1000*jpy + " jens.");
        System.out.println("$1 is " + lira + " lira");
        System.out.println("$1 is " + euro + " euro");
    }
}
