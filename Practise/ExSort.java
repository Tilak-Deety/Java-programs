package Practise;
import java.util.Arrays;
public class ExSort {
    public static void main(String[] args) {
        int[] nums = {15, 28, 37, 5, 94, 49, 39, 349, 49, 953, 593, 32, 29, 2};
//        Arrays.sort(nums);
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
