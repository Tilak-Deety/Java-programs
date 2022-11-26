package stringexamples;
import java.util.Scanner;
//print the reverse of the given input String
public class StringExample10 {
    public static void main(String[] args) {
        String s = "My name is Tilak";
        String rev = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            rev = c+rev;
        }
        System.out.println(rev);
    }
}
