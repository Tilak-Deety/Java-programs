package stringexamples;
import java.util.Scanner;
//program to check whether the given string is a palindrome or not
//take the input from the user
public class StringExample11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a input string: ");
        String s = sc.next();
        String rev = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            rev = c+rev;
        }
        if(s.equalsIgnoreCase(rev))
            System.out.println("The given string is a palindrome");
        else
            System.out.println("The given String is not a palindrome");
    }
}
