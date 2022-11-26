package stringexamples;
import java.util.Scanner;
//Create a new string with digits first and then followed by characters
//Take the input from the user
public class StringExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string containing both numbers and characters: ");
        String s = sc.next();
        String d="" , r="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                d = d+c;
            else
                r = r+c;
        }
        String sen = d + r;
        System.out.println(sen);
    }
}
