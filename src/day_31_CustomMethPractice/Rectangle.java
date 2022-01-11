package day_31_CustomMethPractice;

public class Rectangle {

    /*
    create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
     */

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//3 instance methods:

    public double calculateArea(){      //instance method
        return length*width;
    }

    public double calculatePerimiter(){     //instance method
        return 2*(length+width);
    }

    public String toString() {      //instance method - full info
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimiter=" + calculatePerimiter() +
                '}';
    }
}
