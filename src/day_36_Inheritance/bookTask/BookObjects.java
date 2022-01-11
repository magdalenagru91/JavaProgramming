package day_36_Inheritance.bookTask;

public class BookObjects {
    public static void main(String[] args) {

        eBook eBook1 = new eBook();
        eBook1.setInfo("small", 30);
        eBook1.setInfo("Gone with the wind", "drama", "Mitchel", 35);

        eBook1.readBook();

        System.out.println(eBook1);



        AudioBook audioBook1 = new AudioBook();
        audioBook1.setInfo("Poor daddy, rich daddy", "novel", "Lol", 50);
        audioBook1.setInfo(40, "Eray");

        audioBook1.listen();

        System.out.println(audioBook1);
    }
}
