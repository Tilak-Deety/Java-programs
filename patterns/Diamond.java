package patterns;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=1; row<n; row++){
            for(int space=row; space<=n; space++){
                System.out.print("  ");
            }
            for(int col=1; col<row; col++){
                System.out.print("* ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1; row<=n; row++){
            for(int space=1; space<=row; space++){
                System.out.print("  ");
            }
            for(int col=row; col<n; col++){
                System.out.print("* ");
            }
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
