package stringexamples;
import java.util.Scanner;
//create a word encoding program which moves each letter by 2
//Take the input from the user
public class StringExample12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String s = sc.next();
        String en = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='Y' || c=='y' || c=='Z' || c=='z')
                c-=26;
            c+=2;
            en = en+c;
        }
        System.out.println(en);
    }
}
