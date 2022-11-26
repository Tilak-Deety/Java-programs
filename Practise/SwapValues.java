package Practise;
import java.util.Arrays;
import java.util.Scanner;
public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {50,65,10,93,81,85};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
