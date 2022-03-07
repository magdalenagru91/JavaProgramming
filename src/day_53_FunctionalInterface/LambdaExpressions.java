package day_53_FunctionalInterface;

public class LambdaExpressions {

    public static void main(String[] args) {


        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
                };

        String result = stringReverse.method("Magda");
        System.out.println(result);

        System.out.println("stringReverse.method(\"Kerem\") = " + stringReverse.method("Kerem"));
        System.out.println("stringReverse.method(\"Magda\") = " + stringReverse.method("Magda"));
    }
}
