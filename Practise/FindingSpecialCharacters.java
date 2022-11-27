package Practise;
import java.util.Scanner;
/*This program will return the how many
special characters are present in the given string*/

public class FindingSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a String that contains characters(including special Characters) : ");
        String str = sc.nextLine();
        byte count = 0;
        String specialCharRemoved = "";
        for(int i = 0; i<str.length(); i++){

            if(!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)) &&
                    !Character.isLetter(str.charAt(i))){
                count++;
            }else {
                specialCharRemoved = specialCharRemoved+ str.charAt(i);
            }
        }
        if(count == 0){
            System.out.println("There are no special characters in given string.");
        }
        else{
            System.out.println(count+ " special characters are found." );
        }
        System.out.println("String after special characters are removed : " + specialCharRemoved);
    }
}
