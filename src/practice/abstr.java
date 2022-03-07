package practice;

public interface abstr {

    abstract void readBook();
    abstract void watchTV();


}

 abstract class B implements abstr{

     @Override
     public void readBook() {

     }

 }


class C extends B{

    @Override
    public void watchTV() {

    }
}
