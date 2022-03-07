package day_45_Abstraction_Interface.browserClass;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://google.com");
        chromeDriver.findElement("xpath");
        chromeDriver.findElements("css");
        chromeDriver.close();
        chromeDriver.quit();
        chromeDriver.getTitle();
        chromeDriver.takeScreenShot();
        chromeDriver.executeScript("https://facebook.com");

        FireFoxDriver fireFoxDriver = new FireFoxDriver();

        fireFoxDriver.get("https://google.com");
        fireFoxDriver.findElement("xpath");
        fireFoxDriver.findElements("css");
        fireFoxDriver.close();
        fireFoxDriver.quit();
        fireFoxDriver.getTitle();
        fireFoxDriver.takeScreenShot();
        fireFoxDriver.executeScript("https://facebook.com");

        EdgeDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://google.com");
        edgeDriver.findElement("xpath");
        edgeDriver.findElements("css");
        edgeDriver.close();
        edgeDriver.quit();
        edgeDriver.getTitle();
        edgeDriver.takeScreenShot();
        edgeDriver.executeScript("https://facebook.com");

        SafariDriver safariDriver = new SafariDriver();

        safariDriver.get("https://google.com");
        edgeDriver.findElement("xpath");
        edgeDriver.findElements("css");
        edgeDriver.close();
        edgeDriver.quit();
        edgeDriver.getTitle();
        edgeDriver.takeScreenShot();
        edgeDriver.executeScript("https://facebook.com");

        OperaDriver operaDriver = new OperaDriver();

        operaDriver.get("https://google.com");
        operaDriver.findElement("xpath");
        operaDriver.findElements("css");
        operaDriver.close();
        operaDriver.quit();
        operaDriver.getTitle();
        operaDriver.takeScreenShot();
        operaDriver.executeScript("https://facebook.com");



    }
}
