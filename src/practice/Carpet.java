package practice;

public class Carpet {
    public double width, length,  unitPrice, totalPrice;
    public boolean isPersian = true;


    public Carpet(){
        this.width=300;
        this.length=300;
        this.unitPrice=0;
        this.totalPrice=200;
        this.isPersian=false;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        if(isPersian){
            this.totalPrice=(width+length)*unitPrice + 200;
        } else{
            this.totalPrice=(width+length)*unitPrice;

    }
    }
}
