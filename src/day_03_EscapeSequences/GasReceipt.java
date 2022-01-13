package day_03_EscapeSequences;

public class GasReceipt {

    public static void main(String[] args) {

        String gallons = "Gallons";
        String howManyGallons = "11.840";
        String price = "Price/gallon";
        String priceGallon = "2.089";

                System.out.println("\n     MCLEAN STORE     \n\n" +
                "2021-09-20   09:25PM\n");
                System.out.printf("%-15s %15s %n", gallons, howManyGallons);
                System.out.printf("%-15s %20s %n",price, priceGallon);
                System.out.printf("%-15s %20s %n", "Fuel total:",   "$ 24.734");

                
    }
}
