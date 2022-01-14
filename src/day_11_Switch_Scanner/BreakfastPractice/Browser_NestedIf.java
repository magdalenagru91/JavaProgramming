package day_11_Switch_Scanner.BreakfastPractice;

public class Browser_NestedIf {

    /*
    1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
     */

    public static void main(String[] args) {

        String browserName = "opera";

        if (browserName=="opera" || browserName=="chrome" || browserName=="firefox" || browserName=="safari" || browserName=="edge") {
            if (browserName=="opera") {
                System.out.println("OperaBrowser browser is selected");
            } else if (browserName=="chrome") {
                System.out.println("Chrome browser is selected");
            } else if (browserName=="firefox") {
                System.out.println("Firefox browser is selected");
            } else if (browserName=="safari") {
                System.out.println("Safari browser is selected");
            } else if (browserName == "edge") {
                System.out.println("Edge browser is selected");
            }
        } else  {
            System.out.println("Invalid browser");
        }

    }
}
