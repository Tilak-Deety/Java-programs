package Practise;
import java.util.Scanner;
public class UsdInr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in US dollars : ");
        float USD = sc.nextFloat();
        double rupees = USD * 81.56;
        System.out.println("$"+ USD + " USD is equal to "+ rupees + " indian rupees(INR)");
    }

}
