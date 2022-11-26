package stringexamples;
import java.util.Scanner;
//Print each character line by line along with its ASCII value
//Take the input from the user
public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c+ " ASCII Value is: "+ (int)c);
        }
    }
}
