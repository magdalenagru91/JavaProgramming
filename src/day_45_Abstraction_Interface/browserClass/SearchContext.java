package day_45_Abstraction_Interface.browserClass;

public interface SearchContext {

    /*
    1. Create an interface named SearchContext
				Abstract methods:
					findElement(String locator);
					findElements(String locator);

     */

    public abstract void findElement(String locator);
    public abstract void findElements(String locator);




}
