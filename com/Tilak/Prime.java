package com.Tilak;
import java.util.Scanner;
//checking true or false whether the given number is prime or not
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
      //System.out.println(isPrime(n)); we can also write like this without initializing the
        //answer to another reference variable but both are correct

    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n) return true;
        else return false;
    }
}
