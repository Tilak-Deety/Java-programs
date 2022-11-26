package com.Tilak;
import java.util.Scanner;
public class CharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("The given input character is Lower Case");
        }
        else{
            System.out.println("The given input character is Upper Case");
        }
    }
}
