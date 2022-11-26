package com.Tilak;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a fruit name : ");
        String fruit = sc.next();
        /* syntax for switch case
        switch(expression){
        case 1:
           do something;
           break;
        case 2:
           do something;
           break;
        default:
           do something:
           }
         */
        switch (fruit) {
            case "mango" -> System.out.println("King of all Fruits");
            case "apple" -> System.out.println("A Healthy fruit to eat everyday");
            case "grapes" -> System.out.println("A small fruit which contains 90% of water in it");
            case "watermelon" -> System.out.println("Best fruit to eat in summer season");
            default -> System.out.println("Invalid fruit! please enter a valid fruit");
        }
    }
}
