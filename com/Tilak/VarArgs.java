package com.Tilak;

import java.util.Arrays;
//variable length arguments
//here the length of the array is not constant because it can take many no of inputs until user gives
public class VarArgs {
    public static void main(String[] args) {
        fun(2,56,68,57,91,5,11,17,19,23,29,31,37);
    }
    static void fun(int ...v){ // This ...v denotes the integer array of size which we don't know
                                // v here we can give any letter we want
                                // This will also apply for string , char etc
                                // It will store the values in an array which we don't know
                                // It will store any no of values to an array until we give
        System.out.println(Arrays.toString(v));
    }
}
