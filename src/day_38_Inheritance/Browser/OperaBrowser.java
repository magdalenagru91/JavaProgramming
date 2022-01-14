package day_38_Inheritance.Browser;

public class OperaBrowser extends Browser{
    /*
    3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
     */

    @Override
    public void openBrowser() {
        System.out.println("opening Opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Opera browser");
    }
}
