package Practise;
import java.util.Arrays;
public class TwodArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {20,40,49},
                {23,85,48,61,25},
                {43,49,48}
        };
        System.out.println(arr[1][3]);/*It wil print the element in row 1 and cloumn 3*/
        System.out.println(Arrays.deepToString(arr));/*It wil the print
        all the 2D elements in the given array*/
        System.out.println(arr.length);//It will print the length of the array i.e rows
        System.out.println(arr[1].length);//It will print the no of elements present in the row[1]
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
