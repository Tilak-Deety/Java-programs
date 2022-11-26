package com.Tilak;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class EmpSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current salary : ");
        int salary = sc.nextInt();
        if(salary>10000 || salary<25000){
            salary+= 2000;
        } else if (salary>25000) {
            salary+= 3000;
        } else{
            salary+= 1000;
        }
        System.out.println("The revised salary after increment is : " + salary);
    }

}
