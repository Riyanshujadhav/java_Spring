import java.util.Scanner;

class Account{
    double balance;

    Account(double balance){
        this.balance=balance;
    }
    void display(){
        System.out.println("Balance : "+balance);
    }
}
public class _030 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        Account ac=new Account(sc.nextDouble());
        ac.display();
    }
}
