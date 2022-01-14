package day_38_Inheritance.Browser;

public class SafariBrowser extends Browser{

    /*
    4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
     */

    @Override
    public void openBrowser() {
        System.out.println("opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari browser");
    }
}
