package day_38_Inheritance.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(2);
        circle.perimeter();
        circle.area();

        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        System.out.println(circle + "\n");


        Square square = new Square(3);
        square.perimeter();
        square.area();

        System.out.println(square.perimeter());
        System.out.println(square.area());

        System.out.println(square + "\n");



        Rectangle rectangle = new Rectangle(6, 2);
        rectangle.perimeter();
        rectangle.area();

        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        System.out.println(rectangle);


    }
}
