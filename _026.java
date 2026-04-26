
import java.util.Scanner;

public class _026 {
    static void sum(int a,int b){
        System.out.println("a");   
    }
    static void sum(double a,double b){
        System.out.println("b");
    }
    static void sum(int a,int b,int c){
        System.out.println("c");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        int c=sc.nextInt();
        sum((int)a,(int)b);
    }
}
