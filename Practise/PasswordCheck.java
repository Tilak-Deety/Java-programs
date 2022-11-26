package Practise;
/*
 this program will ask user to guess the password
 until the password is correct..
 if the password is wrong it will ask again
 if the password is correct it will display the output
 */
import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {
        System.out.print("Guess the password : ");
        Scanner sc = new Scanner(System.in);
        String password = "tilakdeety";
        String guess = sc.nextLine();
        while(!guess.toLowerCase().equals(password)){
            System.out.println("Sorry! Password is incorrect..!");
            System.out.print("Guess the Password : ");
            guess = sc.nextLine();
        }
        System.out.println("Congrats.! The password is correct !");
        sc.close();

    }
}
