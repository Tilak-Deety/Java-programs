package Practise;
import java.util.Date;

public class PrintDate {
    public static void main(String[] args) {
        final float pi = 3.14f;
        String x = "2";
        int y = Integer.parseInt(x)+2;
        //converting the string value x into integer using parse int and Integer wrapper class
        System.out.println(y);
//        int random = (int)Math.round(Math.random()*100);
        int random =(int) (Math.random()*100);
        //Rounding that random generated value
        //We know that the result will be in floating value
        //So to remove that extra floating point after the number
        //We are going to explicitly casting with integer
        System.out.println("Random number = " + random); // It will print a random floating number between 0 and 1
        //Then we are multiplying that random generated value with 100
        Date date = new Date();
        String name = "Hello \"Tilak\"";
        String person = "You are a \"Good Programmer\"";
        System.out.println(date);
        System.out.println(name);
        System.out.println(person);
        System.out.println(pi);
    }
}
