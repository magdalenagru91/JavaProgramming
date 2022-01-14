package day_38_Inheritance.Browser;

public class FirefoxBrowser extends Browser{

    /*
    2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
     */

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing fire fox browser");
    }
}
