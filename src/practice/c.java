package practice;

public class c {

    static int  count;

    public c(){
        count++;
    }

    public c(int i){
        count+=i;
    }



    public void c(String s){
        count+=s.length();
    }
}

class Test{
    public static void main(String[] args) {
        new c();

        c a = new c();
        //c a2 = new c("word");
        c a3 = new c(5);
        System.out.println(c.count);

    }
}

