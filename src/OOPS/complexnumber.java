package OOPS;

class complex{
    double x;
    double y;

    complex(double x, double y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(complex z){
        this.x += z.x;
        this.y += z.y;
    }
    void multiply(complex z){
        x = x*z.x - y*z.y;
        y = x*z.y - y*z.x;
    }
    void divide(complex z){
        x = (x*z.x + y*z.y) / (z.x*z.x + z.y*z.y);   // ✔ correct;
        y = (y*z.x - x*z.y) / (z.x*z.x + z.y*z.y);
    }
}
public class complexnumber {
    public static void main(String[] args){
        complex z1 = new complex(2,-5);
        complex z2 = new complex(3,4);
        z1.print(); z2.print();
        z1.add(z2);
        z1.print();z2.print();
        z2.multiply(z1);
        z1.print();z2.print();
        z2.divide(z1);
        z1.print();z2.print();

    }
}
