package com.Tilak;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        float tempC = sc.nextFloat();
        // formula to convert celsius into fahrenheit is celsius * 9/5 + 32
        float tempF = (tempC*9/5) + 32;
        System.out.println(tempF);

    }
}
