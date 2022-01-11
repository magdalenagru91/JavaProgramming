package day_35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);

        circle1.calcPerimeter();
        circle1.calcArea();
        System.out.println(circle1);
    }
}
