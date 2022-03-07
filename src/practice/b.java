package practice;

public class b extends a{


    public void m(){
        System.out.println("lol");
    }


    public static int k(int a){
        return a;
    }


    public static void main(String[] args) {
        System.out.println(k(5));

        b be = new b();

        be.m();
        b.k(5);


        System.out.println(k(3));


    }
}
