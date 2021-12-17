package zzz_INTERVIEW;

public class StrongPassword2 {


    public static void main(String[] args) {

        boolean a = isStrongPassword("Cydeo123#");
        System.out.println("is strong password = " + a);

    }

        public static boolean isStrongPassword(String password){
            boolean r1 = password.length()>=8 && !password.contains(" ");
            boolean r2 = false; //has upper case
            boolean r3 = false; //has lower case
            boolean r4 = false; //has special case
            boolean r5 = false; //has digit


            char[] chars = password.toCharArray();

            for (char each : chars) {
                if (Character.isUpperCase(each)){
                    r2=true;
                }else if (Character.isLowerCase(each)){
                    r3=true;
                }else if (Character.isDigit(each)){
                    r5=true;
                }else { //special char
                    r4=true;
                }
            }
            boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
           return isStrongPassword;


        }
        }



