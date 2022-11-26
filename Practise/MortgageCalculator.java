package Practise;
import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT =100;
        int principal = 0;
        float monthlyInterest = 0;
        byte years = 0;
        int noOfPayments = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Principal Amount : ");
            principal = sc.nextInt();
            if(principal >=1000 && principal <= 1_00_00_000)
                break;
            System.out.println("Please Enter the amount between 1000 and 1 crore ");
        }
        while(true) {
            System.out.print("Annual Interest Rate : ");
            float annualInterest = sc.nextFloat();
            if (annualInterest >= 1.00 && annualInterest <= 30.00) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the Annual Interest between 1 and 30");
        }
        while(true) {
            System.out.print("Period (Years) : ");
            years = sc.nextByte();
            if (years >= 1 && years <= 20){
                noOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter the years between 1 and 20");
        }


        double mortgage = principal
                * (monthlyInterest*Math.pow(1 + monthlyInterest, noOfPayments))
                / (Math.pow(1+monthlyInterest, noOfPayments)) - 1;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : "+ mortgageFormatted);

    }

}
