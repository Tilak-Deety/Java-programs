package Practise;
import java.util.Scanner;
public class RepeatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to repeat : ");
        String name = sc.nextLine();
        System.out.println(name.repeat(100));
    }
}
