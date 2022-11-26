package Practise;
import java.util.Scanner;
public class PrintMessage {
    public static void main(String[] args) {
        System.out.print("Please enter your name : ");
        greeting();
    }
    public static void greeting(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hey "+ name + " Good Morning.!");
    }
}
