package day_39_Recap.ShapeTask;

public class Shape {

    private String name;        //it is not inherited to subclasses because it is private; only methods are inherited


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name cannot be null");
            System.exit(1);         //status code 1 - something went wrong, unexpected event
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {     //constructor for private
        setName(name);
    }




    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
