package com.Tilak;

import java.util.Scanner;

public class StringParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name1 = sc.next();
        String greeting = myGreet(name1);
        System.out.println(greeting);
    }
    static String myGreet(String name){
        String message = "Hello ! " + name + " How are you ? ";
        return message;

    }
}
