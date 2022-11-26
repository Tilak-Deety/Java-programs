package Practise;
import java.util.Arrays;
import java.util.Scanner;
public class Exampleinarrays {
    public static void main(String[] args) {
        System.out.print("Enter some values to store in an array : ");
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));

    }
}
