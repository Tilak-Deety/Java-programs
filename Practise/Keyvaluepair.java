package Practise;
import java.util.Scanner;
public class Keyvaluepair {
    public static void main(String[] args) {
        System.out.print("Please enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String user = name.toLowerCase().equals("tilak")? "login successful" : "login failed" ;
        System.out.println(user);

    }
}
