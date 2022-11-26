package Practise;
import java.util.Scanner;
public class EqualsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "elonmusk";
        System.out.print("Guess the password : ");
        String guess = sc.nextLine();
        System.out.println(password.equals(guess));
    }
}
