package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //User1
//        Users yourUser = new Users();
//        yourUser.setFirstName("Vijay");
//        yourUser.setLastName("Vardhan");
//        //User2
//        Users myUser = new Users();
//        myUser.setFirstName("tilak");
//        myUser.setLastName("deety");
//        //List of all users in ArrayList
//        List<Users> users = new ArrayList<Users>();
//        users.add(yourUser);
//        users.add(myUser);
//
//        System.out.println(users.get(0).getFullName());
//        System.out.println(users.get(1).getFullName());


//        List<Users> users = new ArrayList<Users>();
//
//        String[] firstNames = {"Tilak", "Vijay", "Aslam", "Yeswanth", "Siva", "Virat"};
//        String[] lastNames = {"Deety", "Thota", "Shaik", "Reddy", "Kumar", "Kohli"};
//        for (int i = 0; i< firstNames.length; i++){
//            Users u = new Users();
//            u.setFirstName(firstNames[i]);
//            u.setLastName(lastNames[i]);
//            users.add(u);
//
//        }
//        for (Users u: users){
//            System.out.println(u.getFullName());
//        }
        Student s = new Student();
        s.firstName = "Tilak";
        s.lastName = "Deety";
        s.major = "Masters";
        s.sayHello();
        s.sayIntro();

    }
}
