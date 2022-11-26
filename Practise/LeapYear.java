package Practise;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to see whether it is leap year or not : ");
        int year = sc.nextInt();
        if(year%4==0 && year%100 !=0 || year%400 == 0){
            System.out.println("Year "+ year + " is Leap year");
        }
        else {
            System.out.println("Year "+ year + " is not a leap year");
        }
    }
}
