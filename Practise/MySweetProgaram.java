package Practise;
import java.util.Scanner;
public class MySweetProgaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "sundarpichai";
        System.out.print("Guess the password : ");
        String guess = sc.nextLine();
        if(password.equals(guess)){
            System.out.println("Your guess is Correct..!");
            return;
        }
            System.out.println("The password is incorrect :) Please try again.!");

    }
}
