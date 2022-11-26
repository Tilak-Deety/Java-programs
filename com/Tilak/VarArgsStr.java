package com.Tilak;

import java.util.Arrays;

public class VarArgsStr {
    public static void main(String[] args) {
        fun(); //It will display empty array because we haven't passed any arguments
        fun("Tilak","Vijay","Virat","Dhoni","Hardik"); /* this will print the names
        because we have passed some arguments to the method so it will return the array of names
        that we have been provided*/
    }
    static void fun(String ...s){
        System.out.println(Arrays.toString(s));
    }
}
