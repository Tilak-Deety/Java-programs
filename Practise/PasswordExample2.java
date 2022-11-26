package Practise;
import java.util.Scanner;
/*
 password checking using do-while loop
 do means atleast it will execute
 and in while we give condition and terminate the statement after the while();
 */
public class PasswordExample2 {
    public static void main(String[] args) {
//        System.out.print("Guess the password : ");
        Scanner sc = new Scanner(System.in);
        String password = "tilakdeety";
        String guess;
        do {
            System.out.print("Guess the Password : ");
            guess = sc.nextLine();
        }
        while(!guess.toLowerCase().equals(password));
        System.out.println("Congrats.! The password is correct !");
        sc.close();

    }
}
