package com.Tilak;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.print("The largest number is : "+ max);
    }
}