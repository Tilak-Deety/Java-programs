package stringexamples;
import java.util.Scanner;
//Create a new string by using only uppercase characters in a given string
//Take the input from the user
public class StringExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = sc.next();
        String sn = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                sn = sn + c;
        }
        System.out.println(sn);

    }
}
