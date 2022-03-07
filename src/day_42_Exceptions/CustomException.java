package day_42_Exceptions;


class NoBreakException extends Exception{

}



class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}

public class CustomException{

    public static void main(String[] args) {

        //throw new FadyException();

        //throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }
}