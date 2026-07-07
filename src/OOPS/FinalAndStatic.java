package OOPS;

class Cricketer{
    static String country = "NZ";
    int run;
    String name;
    double avg;
    void print(){
        System.out.println(run+" "+name+" "+avg);
    }

}
public class FinalAndStatic {
    public static void main(String[] args){
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);
    }
}
