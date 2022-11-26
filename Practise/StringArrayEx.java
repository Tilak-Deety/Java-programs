package Practise;
import java.util.Arrays;
import java.util.Scanner;
public class StringArrayEx {
    public static void main(String[] args) {
        System.out.println("Enter names to store in to string array : ");
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        for(int i = 0; i<names.length; i++){
            names[i] = sc.nextLine();
        }
        System.out.print(Arrays.toString(names));
    }
}
