package Practise;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a : ");
        int a = sc.nextInt();
        System.out.print("Please enter b : ");
        int b = sc.nextInt();
        try{
            System.out.print("The division is : " + a/b);
        }catch (ArithmeticException e){
            System.out.println("Sorry! Divided by zero can not be possible");
        }
    }
}
