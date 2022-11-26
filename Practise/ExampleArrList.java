package Practise;
import java.util.ArrayList;
import java.util.Arrays;
public class ExampleArrList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(100);
        marks.add(95);
        marks.add(92);
        marks.add(53);
        marks.add(96);
        marks.add(25);
        marks.set(4, 65);//Replacing the element at index 4
        System.out.println(marks);
        System.out.println(marks.get(4));
        System.out.println("Size of the ArrayList is : "+marks.size());
        System.out.println(marks.indexOf(53));//It will print the index of that element
        System.out.println(marks.contains(69));//It will return the boolean value
        System.out.println(marks.isEmpty());//It checks the if the array is empty or not
        System.out.println(marks.hashCode());

    }

}
