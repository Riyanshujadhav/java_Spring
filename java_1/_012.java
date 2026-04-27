import java.util.Scanner;

public class _012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bal=5000;
        int choice;
        double amount;
        System.out.println("1 Withdraw");
        System.out.println("2 Deposit");   
        System.out.println("3 Balance");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Withdrawal Ammount : ");
                amount=sc.nextDouble();
                if(bal>=amount){
                    bal=bal-amount;
                    System.out.println("Transaction Successful");
                }else{
                    System.out.println("transcation not possible");
                }
                break;
            case 2:
                System.out.println("Deposit Ammount : ");
                amount=sc.nextDouble();
                bal+=amount;
                System.out.println("Deposit Successful");   
                break;
            case 3:
                System.out.println("Balance : "+bal);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

