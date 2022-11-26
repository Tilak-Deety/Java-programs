package Practise;
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        float rupees = sc.nextFloat();
        double USD = rupees / 81.56;
        System.out.println(rupees + " rupees is equal to " + USD + " US Dollars ");
    }
}
