package OOPS;

import java.util.Scanner;
class Student{
    String name;
    int rno;
    double cgpa;
}
public class UserDefinedDataType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); // declaration
        s1.name = "sneha";
        s1.rno = 1691;
        s1.cgpa = 9.9;

        Student s2 = new Student(); // declaration
        s2.name = "Shubhneet";
        s2.rno = 1535;
        s2.cgpa = 9.5;

        Student s3 = new Student(); // declaration
        s3.name = "lovish";
        s3.rno = sc.nextInt();
        s3.cgpa = 9.0;

        System.out.println(s1.name+" "+s2.cgpa+" "+s3.rno);
    }
}