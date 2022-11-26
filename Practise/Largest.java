package Practise;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " i.e, a is the largest number");
        }
        else {
            System.out.println(b + " i.e, b is the largest number");
        }
    }
}
