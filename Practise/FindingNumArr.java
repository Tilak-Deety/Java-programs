package Practise;
//Searching an element in the array
import java.util.Scanner;
import java.util.Arrays;
public class FindingNumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {24, 58, 23, 64, 85, 93};
        System.out.print("Enter a number to search in the array : ");
        int guess = sc.nextInt();
        for (int i = 0; i< nums.length; i++){
            if(nums[i] == guess){
                System.out.println("Element is found at index : " + i);
                return;
            }
        }
        System.out.println("Element is not found");
    }
}
