package Practise;
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        System.out.print("What is your age ? ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Cats or Dogs");
        String animal = sc.nextLine();
        if (age > 18 && animal.equals("Dogs")){
            System.out.println("Your are eligible");
        }

    }
}
