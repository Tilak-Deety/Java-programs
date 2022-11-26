package com.Tilak;

public class Greetings {
    public static void main(String[] args) {
        greetings(); // we are calling the function
        greetings(); // Here the function is called two times... so the output will be printed two times
        /*we can call any function by declaring one time and can be used many number
        of times in the entire program we want but it also depends on the access modifiers
        like if we declare it as public or private or protected ..so the given function will depend
        on this modifiers whether the function can be called or not*/
    }
    static void greetings(){
        System.out.println("Hello Tilak..! Good Morning..!");
    }
}
