package Practise;

public class SubStringExample {
    public static void main(String[] args) {
        String name = "I don't know what to do now!";
        System.out.println(name.substring(6)); // substring
        System.out.println(name.length()); //length of the string
        System.out.println(name.toLowerCase()); //lowercase
        System.out.println(name.toUpperCase()); //uppercase
        System.out.println(name.startsWith("I"));
        System.out.println(name.endsWith("T"));
        System.out.println(name.isBlank());
        System.out.println(name.trim());
        System.out.println(name.replace("what","where"));
        System.out.println(name.hashCode());
    }
}
