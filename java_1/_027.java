
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    double marks;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+rollNo);
        System.out.println("Marks : "+ marks);
    }
}
public class _027 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student();
        s1.name=sc.next();
        s1.rollNo=sc.nextInt();
        s1.marks=sc.nextDouble();

        s1.display();
    }
}
