package day_45_Abstraction_Interface.browserClass;

public interface WebDriver extends SearchContext{

    /*
    2. Create a child interface of SearchContext named WebDriver
				Abstract methods (return-type is void):
					get(String url);
					close();
					quit();
					getTitle();
     */

    void get(String url);
    void close();
    void quit();
    void getTitle();

}
