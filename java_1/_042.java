import java.util.*;
public class _042 {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student=sc.nextInt();
        int [][] marks =new int[student][];
        for(int i=0;i<student;i++){
            int subject=sc.nextInt();
            marks[i]=new int[subject];
            for(int j=0;j<subject;j++){
                marks[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < student; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
