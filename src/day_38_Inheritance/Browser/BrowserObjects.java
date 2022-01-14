package day_38_Inheritance.Browser;

public class BrowserObjects {
    public static void main(String[] args) {


        Browser browser = new Browser();
        browser.openBrowser();
        browser.closeBrowser();

        System.out.println();

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

        System.out.println();

        FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
        firefoxBrowser.openBrowser();
        firefoxBrowser.closeBrowser();

        System.out.println();

        OperaBrowser operaBrowser = new OperaBrowser();
        operaBrowser.openBrowser();
        operaBrowser.closeBrowser();

        System.out.println();

        SafariBrowser safariBrowser = new SafariBrowser();
        safariBrowser.openBrowser();
        safariBrowser.closeBrowser();

    }
}
