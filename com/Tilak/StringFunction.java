package com.Tilak;

public class StringFunction {
    public static void main(String[] args) { // 1) first this statement will execute
        String message = greet(); // 2) then this message variable look for the greet function

        System.out.println(message); // then greet function is assigned to message then finally it will print the message
    }
    static String greet(){ // 3) here the greet function will start executing
        String greeting = "Hey Tilak..! Good Afternoon..!"; //4) then the given input will be assigned to
                                                            //greeting variable
        return greeting;                        //5) then this greeting message will return to
    }
}
