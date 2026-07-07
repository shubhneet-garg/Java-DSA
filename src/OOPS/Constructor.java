package OOPS;

public class Constructor {
    public static class Car{
        int price;
        String name;
        Car(){

        }
        Car(int price, String name){
            this.price = price;
            this.name = name;
        }
        Car(String name, int price){
            this.name = name;
            this.price = price;
        }
        void print(){
            String name = "shubhneet";
            System.out.println(this.price+" "+name);
        }
    }
    public static void main(String[] args){
        Car c1 = new Car(1000000, "kia sonet");
        c1.print();
        Car c2 = new Car("Honda city", 400000);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda";
    }
}
