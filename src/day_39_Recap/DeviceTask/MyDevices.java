package day_39_Recap.DeviceTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyDevices {

    public static void main(String[] args) {



        Blackberry blackberry = new Blackberry("ddd", 500, true, true);
        System.out.println(blackberry);
        blackberry.call(6033870655L);
        blackberry.turnOff();


        Desktop desktop = new Desktop("Asus", "Vivobook", 1000, true, true);
        System.out.println(desktop);
        desktop.reset();
        desktop.reboot();
        desktop.turnOn();


        Google google = new Google("FD", 456, true, false);
        System.out.println(google);
        google.gmail("mag@gmail.com");


        Iphone iphone = new Iphone("X", 1000, true, true);
        System.out.println(iphone);
        iphone.faceTime(6033870655L);


        Laptop laptop = new Laptop("Samsung", "f", 2000, true, true);
        System.out.println(laptop);
        laptop.charge();


        Nokia nokia = new Nokia("x5", 467, true, false);
        System.out.println(nokia);
        nokia.selfDefense();
        nokia.text(7894561114L);


        PersonalComputer personalComputer = new PersonalComputer("Asus", "mag", 2500, true,true);
        System.out.println(personalComputer);
        personalComputer.password();


        Samsung samsung = new Samsung("ppp", 987, false,false);
        System.out.println(samsung);
        samsung.reset();


        TV tv = new TV("Samsung", "tv", 3000, false,true);
        System.out.println(tv);
        tv.channelDown();


        ArrayList<Phone> phones = new ArrayList<>();

        phones.addAll(Arrays.asList(blackberry, nokia, samsung, iphone, google));

        for (Phone each : phones) {
            System.out.println(each.getBrand() + " "+ each.getModel() + " has battery: " + each.isHasBattery());
        }






    }
}
