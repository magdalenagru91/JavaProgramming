package day_45_Abstraction_Interface.browserClass;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecuter{

    private final String browserName;


    public String getBrowserName() {
        return browserName;
    }

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
        System.out.println("Opening " + getBrowserName() + " browser");
    }


    @Override
    public void executeScript(String script) {
        System.out.println("Executing \"" + script + "\" script on " + getBrowserName() + " browser");
    }

    @Override
    public void findElement(String locator) {
        System.out.println(browserName+ " driver locating an element by " + locator);
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName+ " driver locating multiple elements by " + locator);
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking screenshot on: " + browserName + " browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Getting the " + url + " on " + browserName + " browser");

    }

    @Override
    public void close() {
        System.out.println("Closing the tab on " + browserName + " browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting the " + browserName + " browser");
    }

    @Override
    public void getTitle() {
        System.out.println(browserName + " driver is getting the title");
    }




    /*
    5. Create a class named RemoteWebDriver that implements WebDriver, TakeScreenShot, and JavaScriptExecuter Interface:
				Variables:
					browserName (final)

				Encapsulate all the fileds

				Add Constructor that can set the fileds and displays the following message:
							"Opening "+ browserName+" browser"

				Overriden methods and thier implementations:
						get(String url):
								"Getting the "+url+" on " + browserName + " browser"

						findElement(String locator):
								browserName+" driver locating an element by " + locator

						findElements(String locator):
								browserName+" driver locating multiple elements by " + locator

						close():
							"Closing the tab on "+browserName+" browser"

						quit():
							"Quiting the "+browserName+" browser"

						getTitle():
							browserName + "driver is getting the title"

						takeScreenShot():
							"Taking screenshot on: " + browserName + " browser"

						executeScript(String script):
							"Executing \"" + script + "\" script on" + broserName +" browser"
     */
}
