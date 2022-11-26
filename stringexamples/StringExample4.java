package stringexamples;
import java.util.Scanner;
//count the upper case characters in a given string
//take input from the user
public class StringExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String s = sc.next();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                count++;
            System.out.println(count);
        }
    }
}
