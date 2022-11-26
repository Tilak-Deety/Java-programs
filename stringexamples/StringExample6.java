package stringexamples;
import java.util.Scanner;
//print the no of uppercase and lowercase characters in a given string
//Take input from the user
public class StringExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String s = sc.next();
        int countu=0;
        int countl=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                countu++;
            if(Character.isLowerCase(c))
                countl++;
        }
        System.out.println(countu+ " Uppercase Characters");
        System.out.println(countl+ " Lowercase Characters");
    }
}
