package day_44_Abstraction_Interface.deviceTask;

public class DeviceShop {
    public static void main(String[] args) {


        Desktop desktop = new Desktop("Samsung", 2000, "white", "small", true, true);
        Google google = new Google("H3", 600, "black", "big", false, false);
        Iphone iphone = new Iphone("13", 1500, "blue", "small", true, false);
        Laptop laptop = new Laptop("Asus", 3500, "gray", "big", true, true);
        PersonalComputer personalComputer = new PersonalComputer("HP", 5000, "yellow", "big", true, true);
        Samsung samsung = new Samsung("s6", 500, "pink", "small", false, true);

        System.out.println("desktop = " + desktop);
        System.out.println("google = " + google);
        System.out.println("iphone = " + iphone);
        System.out.println("laptop = " + laptop);
        System.out.println("personalComputer = " + personalComputer);
        System.out.println("samsung = " + samsung);


        desktop.turnOn();
        desktop.reset();

        google.turnOff();
        google.call(6033870655L);

        iphone.turnOn();
        iphone.downloadApp();
        iphone.text(6542563335L);

        laptop.turnOff();
        laptop.reset();

        personalComputer.turnOn();

        samsung.downloadApp();
        samsung.text(6033870655L);

    }
}