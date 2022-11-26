package com.Tilak;
//A function which has same name but has different parameters
//This is called function overloading
public class FuncOverloading {
    public static void main(String[] args) {
        fun(72); // this will call the function which declared as int
                    // because we provided integers as arguments for the function
        fun("Tilak"); // this will call the function which declared as String
        // because we provided integers as arguments for the function

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
