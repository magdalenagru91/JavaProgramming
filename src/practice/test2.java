package practice;

public class test2 extends test11 {


    @Override
    protected void method() {
        super.method();
    }

    @Override
    public void method(int a) {
        System.out.println("c");

    }

    public static void main(String[] args) {
        test2 obj = new test2();
        obj.method();
    }
}
