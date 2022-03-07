package day_40_FinalKeyword;


import day_38_Inheritance.ShapeTask.Square;
import day_39_Recap.ShapeTask.Circle;

public class EncapsulationReview {



    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public  void setCircle(Circle circle){

        if(circle.getRadius() < 5){
            return;
        }

        this.circle = circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

}
