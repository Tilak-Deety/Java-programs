package com.Tilak;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum(); // we are calling the function one time
                //we can call the function any number of times we want
                //so the function will going to execute how many number of times we called that function
    }
        static void sum(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter num1 : ");
            int num1 = in.nextInt();
            System.out.print("Enter num2 : ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);

        }
    }
