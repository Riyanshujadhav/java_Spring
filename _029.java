
import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary; 

    Employee() {
        name="0";
        id=0;
        salary=00.00;
    }

    

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }
    
    void display(){
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
        System.out.println("Salary : "+ salary);
    }
}

public class _029 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String name=sc.next();
        int id=sc.nextInt();
        double salary=sc.nextDouble(); 
        Employee e1 = new Employee(name, id, salary);
        Employee e2 = new Employee();
        e1.display();
        e2.display();
    }
}
