package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresofAll {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,4,5,6,7,8,9);
        arr.stream().mapToInt(n -> n * n).forEach(System.out::println);
    }
}
