package stringexamples;
//write a program to reverse the case of a given string
public class StringExample9 {
    public static void main(String[] args) {
        String s = "My name is Tilak!";
        String r ="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                r = r+Character.toLowerCase(c);
            else
                r = r+Character.toUpperCase(c);
        }
        System.out.println(r);
    }
}
