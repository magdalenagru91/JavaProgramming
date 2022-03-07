package day_51_Map;

public class TestEnum {

    public static void main(String[] args) {

       // String browser = "Wooden Spoon";

        Browser browser = Browser.SAFARI;

        switch (browser) {
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");

            default:
                System.out.println("Chrome is selected");
        }


        System.out.println("-----------------------------------");

        Season season = Season.SPRING;

        switch (season) {
            case WINTER:
                System.out.println("It is winter");
                break;
            case FALL:
                System.out.println("It is fall");
                break;
            case SPRING:
                System.out.println("It is spring");
                break;
            case SUMMER:
                System.out.println("it is summer");
                break;
        }
    }
}
