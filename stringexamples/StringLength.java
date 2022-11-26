package stringexamples;
import java.util.Arrays;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string to calculate its length : ");
        String str = sc.next();
        //to print the length of the given string
        System.out.println("The length of the given string is : "+str.length());
        //It will print the character at a given index you specified
        System.out.println("The character at the specified index is : "+str.charAt(2));
        //toString() method will return the string itself
        System.out.println("The given input string is : "+str.toString());
        //this will print the given input string in lower case letters
        System.out.println("The given input string in lower case : "+str.toLowerCase());
        //this will print the given input string in upper case letters
        System.out.println("The given input string in upper case : "+str.toUpperCase());
        //It will print the individual characters in to byte array
        System.out.println(Arrays.toString(str.getBytes()));
        //it will print the hash code of the given input string
        System.out.println("The hash code of the given input string is : "+str.hashCode());
        //it will add the given string with this string
        System.out.println(str.concat(" good morning..!"));
        System.out.println(str.chars());
        //this will return the unicode character of the given input string at the particular index
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePoints());
        //it will compare this string lexicographically with the given input string
        System.out.println(str.compareTo("a"));
        //this equals() method compares the given string with this string
        //if both are equal it returns true otherwise if not returns false
        System.out.println(str.equals("tilak"));
        System.out.println(str.indexOf("t"));
        System.out.println(str.isBlank());
        System.out.println(str.formatted());
        System.out.println(str.intern());
        System.out.println(str.lines());
        System.out.println(str.replace("t","s"));
        System.out.println(str.strip());
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
