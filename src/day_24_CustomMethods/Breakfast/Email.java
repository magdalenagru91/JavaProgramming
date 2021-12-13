package day_24_CustomMethods.Breakfast;



public class Email {
    public static void main(String[]args){
        Domain("magdalenagru91@gmail.com");



        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            Domain(email);
        }

    }

    /*
    Create a method that can display the domain of the email
     */

    public static void Domain(String email){
    String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Domain: " + domain);

    }


}
