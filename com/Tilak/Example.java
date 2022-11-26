package com.Tilak;
import java.util.Arrays;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax for array
        //data type [] variable name = new data type [size of an array];
        //Array of primitives
        int[] arr = new int[5];
//        arr[0] = 5;
//        arr[1] = 10;
//        arr[2] = 25;
//        arr[3] = 75;
//        arr[4] = 95;
//
//        System.out.println(arr[3]);
        for(int i=0 ; i<arr.length ; i++){ // taking the input from the user according to the size declared
            arr[i] = sc.nextInt(); //
        }
//        for (int j : arr) {
//            System.out.println(j + " ");
//
//        }
        System.out.println(Arrays.toString(arr));
    }
}
