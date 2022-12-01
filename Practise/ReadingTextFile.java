package Practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\untitled\\src\\mail.txt"));

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
