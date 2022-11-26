package Practise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Example2ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(25);
        marks.add(57);
        marks.add(23);
        marks.add(38);
        marks.add(58);
        marks.add(39);
        marks.add(2);
        Collections.sort(marks);
        for (int num : marks){
            System.out.println(num);
        }


    }
}
