package OOPS;

class Students{
    String name;
    private int rno=35;
    double cgpa;
    void print(){ //getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
}

public class PrivateKeyword {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.print();
        s1.cgpa = 9.0;
        s1.name = "hemant";
        s1.setRno(45);
        System.out.println(s1.getRno());
    }
}
