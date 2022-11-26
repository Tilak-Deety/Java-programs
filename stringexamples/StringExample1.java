package stringexamples;
import java.util.Scanner;
//print each character of a given string in a separate line
//Take the input from the user
public class StringExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
