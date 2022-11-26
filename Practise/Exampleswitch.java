package Practise;
import java.util.Scanner;
public class Exampleswitch {
    public static void main(String[] args) {
        System.out.print("In order to login please enter your name first : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch(name) {
            case "tilak":
                System.out.println("Hey " + name + " You're an authorized user.");
                break;
            case "vijay":
                System.out.println("Hey " + name + " You are an authorized user but inorder to login in to your account please enter your password");
                System.out.print("Please enter your password : ");
                String password = "vijayvardhan";
                String guess = sc.nextLine();
                if (password.equals(guess)){
                    System.out.println("Your login is successful..Now you have the access");
                }
                break;
            default:
                System.out.println("You are not an authorized user.So you don't have permission");
                break;
        }
    }
}
