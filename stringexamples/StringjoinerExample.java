package stringexamples;

import java.util.StringJoiner;

public class StringjoinerExample {
    public static void main(String[] args) {
        //String joiner using delimiter with prefix and suffix
        StringJoiner str = new StringJoiner("," ,"{","}");
        str.add("tilak").add("vijay").add("siva");
        System.out.println(str);
        //Another String joiner with different prefix and suffix
        StringJoiner stj = new StringJoiner("::","[", "]");
        stj.add("A").add("B").add("C").add("D");
        System.out.println(stj);
        // merging both into one
        str.merge(stj);
        System.out.println(str);

    }
}
