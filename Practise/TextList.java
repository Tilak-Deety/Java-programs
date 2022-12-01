package Practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  In this program we are reading the input from a text file
  and assigning the input to the list object in the array list.
  */
public class TextList {
     public static void main(String[] args) throws FileNotFoundException {
         Scanner sc = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\untitled\\src\\usernames.txt"));

         List<String> user = new ArrayList<>();

         while(sc.hasNextLine()){
             user.add(sc.nextLine());
         }

         for (int i=0; i<user.size(); i++){
             System.out.println("Username : " + user.get(i));
         }

     }
}
