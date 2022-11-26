package stringexamples;
import java.util.Scanner;
//print the uppercase characters in a given string
//take the input from the user
public class StringExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                System.out.print(c);
        }
    }
}
