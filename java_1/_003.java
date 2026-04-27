import java.util.Scanner;

public class _003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double f=0;
        f=(9.0/5)*c+32;
        System.out.println(f);
    }
}
// Because in Java, 9/5 uses integer division since both numbers are integers.

// 9 is an int
// 5 is an int

// So:

// 9 / 5 = 1

// (not 1.8)

// Then your formula becomes:

// f = 1 * c + 32;

// which gives the wrong answer.

// To get decimal division:

// Make at least one number a decimal:

// 9.0 / 5