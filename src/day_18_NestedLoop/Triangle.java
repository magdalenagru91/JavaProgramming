package day_18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        String a = "* ";
        String result = ""; //"*"



        for (int i = 1; i < 11; i++) {

            for (int j = 0; j < 1; j++) {

                result+=a;
                // "*"+=a;  //"*" + "*" = result // "**" //
                System.out.println(result);
            }

        }
      }
    }

