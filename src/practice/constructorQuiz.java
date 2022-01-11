package practice;

public class constructorQuiz {

    public constructorQuiz(){
        System.out.println("A ");
    }
    public constructorQuiz(int a){
        this(2.5);
        System.out.println("B ");
    }
    public constructorQuiz(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        constructorQuiz a = new constructorQuiz(100);
    }


}
